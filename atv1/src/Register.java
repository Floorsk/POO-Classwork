import java.util.ArrayList;
import java.util.Scanner;

public class Register {

    Scanner sc = new Scanner(System.in);

    Client pateta = new Client();

    private ArrayList<Client> clientList = new ArrayList<Client>();

    public Register() {
    }

    public Register(ArrayList<Client> clientList) {
        this.clientList = clientList;
    }

    public ArrayList<Client> getClientList() {
        return clientList;
    }

    public void setClientList(ArrayList<Client> clientList) {
        this.clientList = clientList;
    }

    private Client createClient() {

        Client pateta = new Client();

        System.out.println("Nome do cliente: ");
        pateta.setName(sc.next());

        System.out.println("Cpf do cliente: ");
        pateta.setCpf(sc.nextInt());

        System.out.println("Id do cliente: ");
        pateta.setId(sc.nextInt());

        System.out.println("-----------------------");

        return pateta;

    }

    private Adress createAdress() {

        Adress adr = new Adress();

        System.out.println("Digite o cep: ");
        adr.setCep(sc.nextInt());

        System.out.println("Digite o log: ");
        adr.setLog(sc.next());

        System.out.println("Digite o número: ");
        adr.setNumber(sc.nextInt());

        System.out.println("-----------------------");

        return adr;

    }

    private Phone createPhone() {

        Phone pho = new Phone();

        System.out.println("Digite seu DDD: ");
        pho.setDdd(sc.nextInt());

        System.out.println("Digite seu telefone: ");
        pho.setPhoneNumber(sc.nextInt());

        System.out.println("-----------------------");

        return pho;

    }

    private Account createAccount() {

        Account acc = new Account();

        System.out.println("Digite o número da conta: ");
        acc.setAccountNumber(sc.nextInt());

        System.out.println("Digite sua agência: ");
        acc.setAgency(sc.nextInt());

        System.out.println("Digite o valor da conta: ");
        acc.setBalance(sc.nextFloat());

        System.out.println("-----------------------");

        return acc;

    }

    public void registerClient() {

        Client pateta = createClient();
        Adress adr = createAdress();
        Phone pho = createPhone();
        Account acc = createAccount();

        pateta.setAdress(adr);
        pateta.addPhone(pho);
        pateta.addAccout(acc);

        clientList.add(pateta);

    }

    public void shownClients() {

        for (int i = 0; i < clientList.size(); i += 1) {

            System.out.println(clientList.get(i).getName());

        }

        System.out.println("-----------------------");

    }

    public void deleteClient() {

        System.out.println("Id do cliente: ");
        int id = sc.nextInt();

        for (int i = 0; i < clientList.size(); i += 1) {

            Client idClient = clientList.get(i);

            if (idClient.getId() == id) {

                System.out.println("Cliente Nome: " + idClient.getName()  + ". foi de americanas.");
                clientList.remove(i);
                System.out.println("-----------------------");

            } else if (idClient.getId() != id) {

                System.out.println("Id do cliente não existe.");
                System.out.println("-----------------------");

            }

        }

    }

}
