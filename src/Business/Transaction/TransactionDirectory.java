/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Transaction;

import Business.Card.Card;
import Business.Customer.Customer;
import java.util.ArrayList;

/**
 *
 * @author somnathsolaskar
 */
public class TransactionDirectory {
    
     private ArrayList<Transaction> transactionDirectory;
    
    public TransactionDirectory() {
        transactionDirectory = new ArrayList();
    }

    public ArrayList<Transaction> getTransactionDirectory() {
        return transactionDirectory;
    }

    public void setTransactionDirectory(ArrayList<Transaction> transactionDirectory) {
        this.transactionDirectory = transactionDirectory;
    }
    
    public Transaction newTransaction(Customer customer ,Long amount, Card card, String gateway,String status) { //, ProductDirectory productDirectory
        Transaction mer = new Transaction(customer, amount, card, gateway,status);//, productDirectory
        transactionDirectory.add(mer);
        return mer;
    }
    
    public void removeTransaction(Transaction mer) {
        transactionDirectory.remove(mer);
        
    }
    
    public Transaction getTransaction(Transaction tra){
        for(Transaction mer: transactionDirectory){
            if(mer == tra ){
                return mer;
            }
        }
        return null;
    }
}
