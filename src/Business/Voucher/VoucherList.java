/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Voucher;

import Business.Merchant.Merchant;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author somnathsolaskar
 */
public class VoucherList {
    
    private ArrayList<Voucher> voucherList;

    public VoucherList() {
        voucherList = new ArrayList();
    }

    public ArrayList<Voucher> getVoucherList() {
        return voucherList;
    }

    public void setVoucherList(ArrayList<Voucher> voucherList) {
        this.voucherList = voucherList;
    }
    
    public Voucher newVoucher(String name, String code, int points, String category, Merchant merchant) {
        Voucher pr = new Voucher(name, code, points, category, merchant);
        voucherList.add(pr);
        return pr;
    }
    
    public void removeVoucher(Voucher voucher) {
        voucherList.remove(voucher);
    }
    
}
