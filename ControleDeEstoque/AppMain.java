import java.util.Scanner;

public class AppMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean up = true;
        Item[] itens = new Item[5];

        itens[0] = new Acessorio("Relógio", 5, 1, 10);
        itens[1] = new RoupaTamanhoUnico("Roupa azul da Hurley", 10, 1, 20);
        itens[2] = new RoupaPMG("Roupa preta da Mahalo", 15, 7, 11, 1, 20);
        itens[3] = new Acessorio("Óculos escuro", 4, 1, 10 );
        itens[4] = new RoupaPMG("Roupa branca da Santa Cruz", 12, 15, 20, 1, 30);

        System.out.println("Bem-Vindo a loja Java!");
        do {
            System.out.println("Menu Principal - Itens disponiveis:"
            +"\n1 - " + itens[0].getDescricao() 
            +"\n2 - " + itens[1].getDescricao() 
            +"\n3 - " + itens[2].getDescricao()
            +"\n4 - " + itens[3].getDescricao()
            +"\n5 - " + itens[4].getDescricao()
            +"\n0 - Sair do programa.");

            int op = sc.nextInt();

            switch ((op)) {
                case 1:
                    itens[0].venda();
                    break;
                case 2:
                    itens[1].venda();
                    break;
                case 3:
                    itens[2].venda();
                    break;
                case 4:
                    itens[3].venda();
                    break;
                case 5:
                    itens[4].venda();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    up = false;
                    break;
                default:
                    System.out.println("Opção inválida");
                    return;
            }
        } while (up == true);
    }
}
