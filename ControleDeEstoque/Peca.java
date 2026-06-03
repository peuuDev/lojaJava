// A classe abstrata Peca deve ter:
//  Um método construtor que recebe por parâmetro a descrição do produto, a quantidade em
// estoque, o estoque mínimo e o estoque máximo e define os valores dos atributos.
//  Um método abstrato venda.
//  Os métodos get e set que forem necessários para a implementação da aplicação.
//  O método reposicaoEstoque que verifica se o estoque está abaixo do mínimo e, caso isto
// aconteça, iguala o estoque ao estoque máximo. Se o estoque não está abaixo do mínimo não
// deve fazer nada.

public abstract class Peca {
    protected String descricao;
    protected int quantidade;
    protected int estoqueMin;
    protected int estoqueMax;

    public Peca(String descricao, int quantidade, int estoqueMin, int estoqueMax){
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.estoqueMin = estoqueMin;
        this.estoqueMax = estoqueMax;
    }

    public abstract void venda();

    public int reposicaoEstoque(){
        if(quantidade < estoqueMin){
            setQuantidade(estoqueMax);
            System.out.println("Estoque de " + getDescricao() + " reposto!");
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

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
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
