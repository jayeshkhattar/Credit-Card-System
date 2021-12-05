/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class CustomerDirectory {
    
    private ArrayList<Customer> customerDirectory;
    
    public CustomerDirectory() {
        
        customerDirectory = new ArrayList();
        
    }

    public ArrayList<Customer> getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(ArrayList<Customer> customerDirectory) {
        this.customerDirectory = customerDirectory;
    }
    
    //public Customer newCustomer(String cust_name, String cust_email, String cust_phoneNumber, int cust_age, String cust_homeAddress, String cust_userName){
      //  Customer customer = new Customer(cust_name, cust_email, cust_phoneNumber, cust_age, cust_homeAddress, cust_userName);
       // customerDirectory.add(customer);
      //  return customer;
//    }
    
    public void removeCustomer(Customer customer){
        customerDirectory.remove(customer);
    }
    
  /*  public Customer getCustomer(String cust_name){
        for(Customer customer: customerDirectory){
            if(customer.getCust_name().equalsIgnoreCase(cust_name)){
                return customer;
            }
        }
        return null;
    }*/
    
}
