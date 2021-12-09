/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Merchant;

import Business.Product.ProductDirectory;

/**
 *
 * @author achintyasingh
 */
public class Merchant {
    
    private String name;
    private String address;
    private String managerName;
    private String phoneNumber;
    private ProductDirectory productDirectory;

    public Merchant(String name, String address, String managerName, String phoneNumber) {//, ProductDirectory productDirectory
        this.name = name;
        this.address = address;
        this.managerName = managerName;
        this.phoneNumber = phoneNumber;
        //this.productDirectory = productDirectory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public ProductDirectory getProductDirectory() {
        return productDirectory;
    }

    public void setProductDirectory(ProductDirectory productDirectory) {
        this.productDirectory = productDirectory;
    }
    
     @Override
    public String toString() {
        return name;
    } 
    
    
}
