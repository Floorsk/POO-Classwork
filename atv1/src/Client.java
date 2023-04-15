import java.util.ArrayList;

public class Client {

    private int cpf;
    private String name;
    private int id;
    private Adress adress;
    private ArrayList<Account> account = new ArrayList<Account>();
    private ArrayList<Phone> phone = new ArrayList<Phone>();

    public Client() {
    }

    public Client(int cpf, String name, Adress adress, ArrayList<Account> account, ArrayList<Phone> phone) {
        this.cpf = cpf;
        this.name = name;
        this.adress = adress;
        this.account = account;
        this.phone = phone;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Account> getAccount() {
        return account;
    }

    public void setAccount(ArrayList<Account> account) {
        this.account = account;
    }

    public void addAccout(Account newAccount) {
        this.account.add(newAccount);
    }

    public ArrayList<Phone> getPhone() {
        return phone;
    }

    public void setPhone(ArrayList<Phone> phone) {
        this.phone = phone;
    }

    public void addPhone(Phone newPhone) {
        this.phone.add(newPhone);
    }

}
