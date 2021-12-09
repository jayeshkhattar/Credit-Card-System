/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Product;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author achintyasingh
 */
public class ProductDirectory {
   
    private ArrayList<Product> productDirectory;

    public ProductDirectory() {
        productDirectory = new ArrayList();
    }

    public ArrayList<Product> getProductDirectory() {
        return productDirectory;
    }

    public void setProductDirectory(ArrayList<Product> productList) {
        this.productDirectory = productList;
    }
    
    public Product newProduct(String name, String code, int price, String category, int points) {
        Product pr = new Product(name, code, price, category, points);
        productDirectory.add(pr);
        return pr;
    }
    
    public void removeProduct(Product pr) {
        productDirectory.remove(pr);
    }
    
}
