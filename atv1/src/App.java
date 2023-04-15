import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        try (Scanner sc = new Scanner(System.in)) {
            Register r = new Register();

            int choice = 0;

            do {

                System.out.println("1-Cadastras cliente\n2-Listar clientes\n3-Excluir clientes\n4-Sair");

                choice = sc.nextInt();

                System.out.println("-----------------------");

                switch (choice) {
                    case 1:
                        r.registerClient();
                        break;
                    case 2:
                        r.shownClients();
                        break;
                    case 3:
                        r.deleteClient();
                        break;
                    default:
                        break;
                }

            } while (choice != 4);
        }

    }
}
