import java.util.Scanner;

public class Account {

    Scanner sc = new Scanner(System.in);
    
    private int accountNumber;
    private int agency;
    private float balance;

    public Account() {
        balance = 0f;
    }

    public Account(int accountNumber, int agency, float balance ) {
        this.accountNumber = accountNumber;
        this.agency = agency;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAgency() {
        return agency;
    }

    public void setAgency(int agency) {
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
