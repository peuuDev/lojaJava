// A classe Acessorio:

//  Deve sobrescrever os métodos da classe Peca que se fizerem necessários para a implementa-
// ção da aplicação.

//  O método venda deve receber pelo teclado a quantidade vendida do acessório e ajustar o
// atributo quantidade.
import java.util.Scanner;

public class Acessorio extends Peca implements Item{
    Scanner sc = new Scanner(System.in);
    public Acessorio(String descricao, int quantidade, int estoqueMin, int estoqueMax){
        super(descricao, quantidade, estoqueMin, estoqueMax);
    }

    public void venda(){
        System.out.println("Quantos acessórios(" + getDescricao() + ") deseja?");
        try {
            int qntd = sc.nextInt();
            reposicaoEstoque();
            setQuantidade(quantidade--);
            System.out.println(qntd + " acessorio(s) comprado(s)!");
        } catch (java.util.InputMismatchException e) {
            System.out.println("Entrada inválida. Digite um número inteiro.");
            sc.nextLine();
        }
    }
}
