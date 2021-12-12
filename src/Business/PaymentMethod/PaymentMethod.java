/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.PaymentMethod;

/**
 *
 * @author somnathsolaskar
 */
public class PaymentMethod {
    
    private String name;
    private String method;
    
      public PaymentMethod(String name, String method) {
        this.name = name;
        this.method = method;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }
    
           @Override
    public String toString() {
        return name;
    } 
    
}
