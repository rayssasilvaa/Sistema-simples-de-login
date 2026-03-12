import java.util.Scanner;

public class SistemaLogin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String usuarioCorreto = "admin";
        int senhaCorreta = 123;
        int tentativas = 3;

        try {
            while (tentativas > 0) {
                System.out.println("Usuário: ");
                String usuario = input.nextLine();

                System.out.println("Senha (apenas números): ");
                int senha = input.nextInt();
                input.nextLine();

                if (usuario.equals(usuarioCorreto) && senha == senhaCorreta) {
                    System.out.println("Login realizado com sucesso!");
                    return;
                } else {
                    tentativas--;
                    System.out.println("Usuário ou senha incorretos.");

                    if (tentativas > 0) {
                        System.out.println("Tentativas restantes: " + tentativas);
                    }
                }
            }
            throw new IllegalArgumentException("Conta bloqueada. Muitas tentativas.");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Sistema encerrado!");
            input.close();
        }

    }
}
