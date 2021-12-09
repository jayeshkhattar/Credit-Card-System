/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Merchant;

import Business.Merchant.Merchant;
import Business.Product.ProductDirectory;
import java.util.ArrayList;

/**
 *
 * @author somnathsolaskar
 */
public class MerchantDirectory {
    private ArrayList<Merchant> merchantDirectory;
    
    public MerchantDirectory() {
        merchantDirectory = new ArrayList();
    }

    public ArrayList<Merchant> getMerchantDirectory() {
        return merchantDirectory;
    }

    public void setMerchantDirectory(ArrayList<Merchant> merchantDirectory) {
        this.merchantDirectory = merchantDirectory;
    }
    
    public Merchant newMerchant(String name, String address, String manager, String phoneNumber) { //, ProductDirectory productDirectory
        Merchant mer = new Merchant(name, address, manager, phoneNumber);//, productDirectory
        merchantDirectory.add(mer);
        return mer;
    }
    
    public void removeMerchant(Merchant mer) {
        merchantDirectory.remove(mer);
    }
}
