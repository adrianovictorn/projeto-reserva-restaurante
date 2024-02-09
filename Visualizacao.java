import java.util.Scanner;
import java.time.LocalDateTime;
import java.util.Scanner;
    
public class Visualizacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Restaurante restaurante = new Restaurante("Meu Restaurante", "Endereço do Restaurante", 50);

        while (true) {
            System.out.println("Bem-vindo ao Sistema de Reservas de Mesas do Restaurante Comer Bem");
            System.out.println("1. Solicitar Reserva");
            System.out.println("2. Confirmar Reserva");
            System.out.println("3. Cancelar Reserva");
            System.out.println("4. Consultar Reservas");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opcao: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    solicitarReserva(restaurante);
                    break;
                case 2:
                    confirmarReserva(restaurante);
                    break;
                case 3:
                    cancelarReserva(restaurante);
                    break;
                case 4:
                    consultarReservas(restaurante);
                    break;
                case 5:
                    System.out.println("Saindo do programa...");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
            }
        }
    }

    public static void solicitarReserva(Restaurante restaurante) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Digite seu CPF: ");
        String cpf = scanner.nextLine();
        System.out.println("Digite seu e-mail: ");
        String email = scanner.nextLine();
        Cliente cliente = new Cliente("", email, nome, cpf, "");

        System.out.println("Digite a data e hora da reserva (yyyy-MM-dd HH:mm): ");
        String dataHoraString = scanner.nextLine();
        LocalDateTime dataHora = LocalDateTime.parse(dataHoraString);
        System.out.println("Digite o número de pessoas: ");
        int numPessoas = scanner.nextInt();

        Mesa mesa = new Mesa("1", "Mesa 1", 4);

        Reserva reserva = cliente.solicitarReserva(restaurante, dataHora, numPessoas, mesa);
        if (reserva != null) {
            System.out.println("Reserva realizada com sucesso!");
        } else {
            System.out.println("Não foi possível realizar a reserva. Tente novamente mais tarde.");
        }
    }

    public static void confirmarReserva(Restaurante restaurante) {
    }

    public static void cancelarReserva(Restaurante restaurante) {
    }

    public static void consultarReservas(Restaurante restaurante) {
    }
}
 