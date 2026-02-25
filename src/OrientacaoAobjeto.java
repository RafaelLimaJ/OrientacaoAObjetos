import com.oriencaoaobjetos.entity.Carro;
import java.util.Scanner;

public class OrientacaoAobjeto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos carros deseja adicionar?");
        int quantidadeDeCarros = scanner.nextInt();
        scanner.nextLine();

        Carro[] garagem = new Carro[quantidadeDeCarros];
        int somaTotal = 0;

        for(int i = 0; i < quantidadeDeCarros; i++) {
            garagem[i] = new Carro();

            System.out.println("\n--- Cadastro do Carro " + (i + 1) + " ---");
            System.out.print("Modelo: ");
            garagem[i].modelo = scanner.nextLine();

            System.out.print("Quantidade: ");
            garagem[i].quantidade = scanner.nextInt();

            System.out.print("Preço: ");
            garagem[i].preco = scanner.nextInt();
            scanner.nextLine();

            somaTotal += (garagem[i].preco * garagem[i].quantidade);
        }
        System.out.println("\n--- RELATÓRIO DE ESTOQUE ---");

        for (int i = 0; i < quantidadeDeCarros; i++) {
            System.out.println("Carro: " + garagem[i].modelo + " | Valor Unitário: R$ " + garagem[i].preco);
        }
        System.out.println("\nTotal de modelos cadastrados: " + quantidadeDeCarros);
        System.out.println("Valor total do estoque: R$ " + somaTotal);
        scanner.close();
    }
}