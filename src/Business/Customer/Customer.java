/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Customer;


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

    private float totalPointsEarned;
    private float pointsUsed;
    private float pointsRemaining;
    private float expenditure;
    
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
        
        totalPointsEarned = 0;
        pointsUsed = 0;
        pointsRemaining = 0;
        expenditure = 0;
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

    public float getTotalPointsEarned() {
        return totalPointsEarned;
    }

    public void setTotalPointsEarned(float totalPointsEarned) {
        this.totalPointsEarned = totalPointsEarned;
    }

    public float getPointsUsed() {
        return pointsUsed;
    }

    public void setPointsUsed(float pointsUsed) {
        this.pointsUsed = pointsUsed;
    }

    public float getPointsRemaining() {
        return pointsRemaining;
    }

    public void setPointsRemaining(float pointsRemaining) {
        this.pointsRemaining = pointsRemaining;
    }

    public float getExpenditure() {
        return expenditure;
    }

    public void setExpenditure(float expenditure) {
        this.expenditure = expenditure;
    }

    
    @Override
    public String toString() {
        return name;
    }    
    
}
