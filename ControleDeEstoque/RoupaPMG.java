// A classe RoupaPMG:
//  O método venda solicita pelo teclado o tamanho do ítem (P, M ou G) e subtrai uma unidade
// da quantidade adequada (quantidadeP, quantidadeM ou quantidadeG).
//  Deve ter um método reposicaoEstoque que verifica se o estoque de cada tamanho está
// abaixo do mínimo e, caso isto aconteça, iguala o estoque ao estoque máximo. Se o estoque
// não está abaixo do mínimo a quantidade não deve ser alterada.

import java.util.Scanner;

public class RoupaPMG implements Item {
    Scanner sc = new Scanner(System.in);
    protected String descricao;
    protected int quantidadeP;
    protected int quantidadeM;
    protected int quantidadeG;
    protected int estoqueMin;
    protected int estoqueMax;

    public RoupaPMG(String descricao, int quantidadeP, int quantidadeM, int quantidadeG, int estoqueMin, int estoqueMax){
        this.descricao = descricao;
        this.quantidadeP = quantidadeP;
        this.quantidadeM = quantidadeM;
        this.quantidadeG = quantidadeG;
        this.estoqueMin = estoqueMin;
        this.estoqueMax = estoqueMax;
    }

    public void venda(){
        System.out.println("Qual o tamanho deseja para sua roupa?\n[1] P\n[2] M\n[3] G");
        int tamanho = sc.nextInt();  
        reposicaoEstoque();
        switch (tamanho){
            case 1:
                System.out.println("Camisa P comprada!");
                setQuantidadeP(quantidadeP--);
                break;
            case 2:
                System.out.println("Camisa M comprada!");
                setQuantidadeM(quantidadeM--);
                break;
            case 3:
                System.out.println("Camisa G comprada!");
                setQuantidadeG(quantidadeG--);
                break;
            default:
                System.out.println("Tamanho indisponivel.");
                return;
        }
    }

    public int reposicaoEstoque(){
        if(quantidadeP < estoqueMin){
            setQuantidadeP(estoqueMax);
            System.out.println("Camisas tamanho P repostas no estoque!");
            return 1;
        }else if(quantidadeM < estoqueMin){
            setQuantidadeM(estoqueMax);
            System.out.println("Camisas tamanho M repostas no estoque!");
            return 1;
        }else if(quantidadeG < estoqueMin){
            setQuantidadeG(estoqueMax);
            System.out.println("Camisas tamanho G repostas no estoque!");
            return 1;
        }

        System.out.println("Não há necessidade de repor o estoque, por enquanto.");
        return 0;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidadeP() {
        return quantidadeP;
    }

    public void setQuantidadeP(int quantidadeP) {
        this.quantidadeP = quantidadeP;
    }

    public int getQuantidadeM() {
        return quantidadeM;
    }

    public void setQuantidadeM(int quantidadeM) {
        this.quantidadeM = quantidadeM;
    }

    public int getQuantidadeG() {
        return quantidadeG;
    }

    public void setQuantidadeG(int quantidadeG) {
        this.quantidadeG = quantidadeG;
    }

    public int getEstoqueMin() {
        return estoqueMin;
    }

    public void setEstoqueMin(int estoqueMin) {
        this.estoqueMin = estoqueMin;
    }

    public int getEstoqueMax() {
        return estoqueMax;
    }

    public void setEstoqueMax(int estoqueMax) {
        this.estoqueMax = estoqueMax;
    }

    
}
