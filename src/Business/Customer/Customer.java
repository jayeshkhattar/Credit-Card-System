/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Customer;

import Business.Product.Product;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author achintyasingh
 */
public class Customer {

    private String name;
    private String address;
    private String email;
    private String phone;
    private int age;
    private long ssn;
    private long bankBalance;
    private String userame;
    private String bankName;
    private ArrayList<Shopping> shoppingList;

    public Customer(String name, String email, String phone, int age, long ssn, String address, String userame, String bankName, Long bankBalance) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.age = age;
        this.ssn = ssn;
        this.address = address;
        this.userame = userame;
        this.bankName = bankName;
        this.bankBalance = bankBalance;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUserame() {
        return userame;
    }

    public void setUserame(String userame) {
        this.userame = userame;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public long getSsn() {
        return ssn;
    }

    public void setSsn(long ssn) {
        this.ssn = ssn;
    }

    public long getBankBalance() {
        return bankBalance;
    }

    public void setBankBalance(long bankBalance) {
        this.bankBalance = bankBalance;
    }

    public ArrayList<Shopping> getShoppingList() {
        return shoppingList;
    }

    public void setShoppingList(ArrayList<Shopping> shoppingList) {
        this.shoppingList = shoppingList;
    }

    public Shopping newShopping(String orderNumber, Product product, Customer customer, Date purchaseDate, String paymentMethod) {
        Shopping shopping = new Shopping(orderNumber, product, customer, purchaseDate, paymentMethod);
        shoppingList.add(shopping);
        return shopping;
    }
    
    public void removeShopping(Shopping shopping){
        shoppingList.remove(shopping);
    }
    
    @Override
    public String toString() {
        return name;
    }    
    
}
