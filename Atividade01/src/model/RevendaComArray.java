package model;
public class RevendaComArray{
    private Produto[] produtos;
    private int indice=0;
   
    public RevendaComArray(int qnt_produtos){
        super();
        this.produtos = new Produto[qnt_produtos];
    }
  
    public void inserirProduto(Produto p){
        this.produtos[indice] = p;
        indice++;
    } 
  
    public void comprarProduto(int codigo,int qnt_estoque){
        for(Produto produto : this.produtos){
            if(produto.getCodigo() == codigo){
                produto.Compra(qnt_estoque);
                System.out.println("Compra realizada com sucesso.");
                return;
            }  
        }     
        System.out.println("Erro ao efetuar a compra.");
        
    }

    public void venderProduto(int codigo,int qnt_estoque){
        for(Produto produto : this.produtos){
            if(produto.getCodigo() == codigo){
                produto.Venda(qnt_estoque);
                System.out.println("Venda realizada com sucesso.");
                return;
            }
        }
        System.out.println("Erro ao efetuar a venda.");
    }
  
    public void consultaPrecoVenda(int codigo){
        for(Produto produto : this.produtos){
            if(produto.getCodigo() == codigo){
                System.out.println("Valor de venda: " + produto.calculaPrecoVenda());  
                return;
          }
        }
        System.out.println("Produto não cadastrado");
    }
  
    public void listarProdutos(){
        System.out.println("Produtos cadastrados: ");
        for(Produto produto : this.produtos){
            System.out.println("Código: " + produto.getCodigo() +
                                "\nDescrição: "+ produto.getDescricao() +
                                    "\nValor de venda : " + produto.calculaPrecoVenda());
        }
    }
  
    public Produto getProdutoToCode(int code){
        for(Produto produto : this.produtos){
            if(produto.getCodigo() == code){
                return produto;
            }
        }
        System.out.println("Produto não cadastrado");
        return null;
    }




}