public class Produto{

  private int codigo;
  private String descri;
  private double valor;
  private double custo;
  private double lucro;
  private int qntEstoque;
  //constructors
  public Produto(int codigo, String descri){
    super();
    this.codigo = codigo;
    this.descri = descri;
  }
  public Produto(int codigo, String descri,double valor,double custo,double lucro){
    super();
    this.codigo = codigo;
    this.descri = descri;
    this.valor = valor;
    this.custo = custo;
    this.lucro = lucro;
  }
  public Produto(int codigo, String descri,double valor,double custo,double lucro,int qntEstoque){
    super();
    this.codigo = codigo;
    this.descri = descri;
    this.valor = valor;
    this.custo = custo;
    this.lucro = lucro;
    this.qntEstoque = qntEstoque;
  }
//getters/setters
public int getCodigo(){
  return this.codigo;
}
  public double getValor(){
    return this.valor;
  }
  public double getCusto(){
    return this.custo;
  }
  public double getLucro(){
    return this.lucro;
  }

  public void setCodigo(int codigo){
    this.codigo = codigo;
  }
  public void setValor(double valor){
    this.valor = valor;
  }
  public void setCusto(double custo){
    this.custo = custo;
  }
  public void setLucro(double lucro){
    this.lucro = lucro;
  }

//methods
  void Compra(int qnt) {
    this.qntEstoque = this.qntEstoque + qnt;
  }
  void Venda(int qnt){
    this.qntEstoque = this.qntEstoque - qnt;
  }
  double calculaPrecoVenda(){
    return this.valor + this.custo + this.lucro*(this.valor + this.custo);
  }




}

/*crie métodos getAtributo e setAtributo para os atributos: valor de compra, custo e margem de lucro
• crie um construtor para inicializar o valor dos atributos: código e descrição
• crie um construtor para inicializar o valor dos atributos: código, descrição, valor de compra, custo e
margem de lucro
• crie um construtor para inicializar o valor dos atributos: código, descrição, valor de compra, custo,
margem de lucro e quantidade em estoque*/