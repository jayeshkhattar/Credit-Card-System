/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.PaymentMethod;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author somnathsolaskar
 */
public class PaymentMethodDirectory {
    private ArrayList<PaymentMethod> paymentMethodDirectory;

    public PaymentMethodDirectory() {
        paymentMethodDirectory = new ArrayList();
    }

    public ArrayList<PaymentMethod> getPaymentMethodDirectory() {
        return paymentMethodDirectory;
    }

    public void setPaymentMethodDirectory(ArrayList<PaymentMethod> paymentMethodDirectory) {
        this.paymentMethodDirectory = paymentMethodDirectory;
    }
    
    public PaymentMethod newPaymentMethod(String name, String method) {
        PaymentMethod pr = new PaymentMethod(name, method);
        paymentMethodDirectory.add(pr);
        return pr;
    }
    
    public void removePaymentMethod(PaymentMethod pr) {
        paymentMethodDirectory.remove(pr);
    }
}
