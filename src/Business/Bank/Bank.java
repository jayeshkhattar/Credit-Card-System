/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Bank;

/**
 *
 * @author achintyasingh
 */
public class Bank {
    
    private String name;
    private String code;
    private String mainBranchAdress;
    private String adminName;

    public Bank(String name, String code, String mainBranchAdress) {
        this.name = name;
        this.code = code;
        this.mainBranchAdress = mainBranchAdress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMainBranchAdress() {
        return mainBranchAdress;
    }

    public void setMainBranchAdress(String mainBranchAdress) {
        this.mainBranchAdress = mainBranchAdress;
    }
    public String getAdminName() {
        return adminName;
    }

    public void setBankAdminName(String adminName) {
        this.adminName = adminName;
    }    
}
