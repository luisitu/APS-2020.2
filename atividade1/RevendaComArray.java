public class RevendaComArray{
  private Produto[] produtos;
  private int i;
 
  public RevendaComArray(int qnt_produtos){
    super();
    this.produtos[qnt_produtos] = null;
  }

  void inserirProduto(Produto p){
    for(int i=0; i<produtos.length; i++){
        this.produtos[i] = p;
    }
  } 

  void comprarProduto(int codigo,int qnt_estoque){
      for(int i=0; i<produtos.length; i++){
        if(produtos[i].getCodigo() == codigo){
            produtos[i].Compra(qnt_estoque);
        }else 
          System.out.println("Produto não cadastrado");
      }
  }
  void venderProduto(int codigo,int qnt_estoque){
      for(int i=0; i<produtos.length; i++){
        if(produtos[i].getCodigo() == codigo){
            produtos[i].Venda(qnt_estoque);
        }else 
          System.out.println("Produto não cadastrado");
      }
  }

    void calculaPreVenProduto(int codigo,int qnt_estoque){
      for(int i=0; i<produtos.length; i++){
        if(produtos[i].getCodigo() == codigo){
            System.out.println(produtos[i].calculaPrecoVenda());  
        }else 
          System.out.println("Produto não cadastrado");
      }
  }

  void listarProdutos(){

  }

}