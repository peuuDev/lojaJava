// A classe RoupaTamanhoUnico:

//  Deve sobrescrever os métodos da classe Peca que se fizerem necessários para a implementa-
// ção da aplicação.

//  O método venda só subtrai uma unidade do estoque.

public class RoupaTamanhoUnico extends Peca implements Item{

    public RoupaTamanhoUnico(String descricao, int quantidade, int estoqueMin, int estoqueMax){
        super(descricao, quantidade, estoqueMin, estoqueMax);
    }    

    public void venda(){
        System.out.println("Roupa vendida!");
        reposicaoEstoque();
        quantidade--; 
    }
}
