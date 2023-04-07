import java.util.Scanner;

public class Account {

    Scanner sc = new Scanner(System.in);
    
    private int accountNumber;
    private String agency;
    private float balance;

    public Account() {
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public void extract() {

        System.out.println(getBalance());

    }

    public void deposit() {

        setBalance(getBalance() + sc.nextFloat());
        System.out.println(getBalance());

    }

    public void withdraw() {

        setBalance(getBalance() - sc.nextFloat());
        System.out.println("Seu saldo atual é de: R$" +  getBalance());

    }



}
