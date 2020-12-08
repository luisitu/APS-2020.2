import model.Produto;
import model.RevendaComArray;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Informe a quantidade de produtos desejados: ");
            int qnt = scanner.nextInt();

            RevendaComArray RCA = new RevendaComArray(qnt);
            int op = -1;
            while(op != 0){
                System.out.println("1 - Criar produto");
                System.out.println("2 - Comprar");
                System.out.println("3 - Vender");
                System.out.println("4 - Consultar preço");
                System.out.println("5 - Listar Preços");
                System.out.println("6 - Alterar produtos");
                System.out.println("0 - Sair");

                System.out.print("Sua opção: ");
                op = scanner.nextInt();

                int codigo;
                String descri;
                double compra;
                double custo;
                double mLucro;
                int qntd;

                if(op == 1){
                    System.out.println("Cadastrar produto:");
                    System.out.print("Código: ");
                    codigo = scanner.nextInt();
                    System.out.print("Descrição: ");
                    descri = scanner.next();
                    System.out.print("Valor de compra: ");
                    compra = scanner.nextDouble();
                    System.out.print("Custo: ");
                    custo = scanner.nextDouble();
                    System.out.print("Margem de lucro: ");
                    mLucro = scanner.nextDouble();
                    System.out.print("Quantidade em estoque: ");
                    qntd = scanner.nextInt();

                    Produto produto = new Produto(codigo, descri, compra, custo, mLucro, qntd); // construtor
                    RCA.inserirProduto(produto);
                    System.out.println("Produto criado!");

                }else if( op == 2 ){
                    System.out.println("Comprar produto:");
                    System.out.print("Código: ");
                    codigo = scanner.nextInt();
                    System.out.print("Quantidade: ");
                    qntd = scanner.nextInt();

                    RCA.comprarProduto(codigo, qntd); //compra
                }else if( op == 3 ){
                    System.out.println("Vender produto:");
                    System.out.print("Cógigo: ");
                    codigo = scanner.nextInt();
                    System.out.print("Quantidade desejada: ");
                    qntd = scanner.nextInt();

                    RCA.venderProduto(codigo, qntd); //venda
                }else if( op == 4){
                    System.out.println("Consultar preço:");
                    System.out.print("Cógigo: ");
                    codigo = scanner.nextInt();

                    RCA.consultaPrecoVenda(codigo);   //calcular preço de revenda    
                }else if( op == 5){
                    System.out.println("Catálogo\n");
                    RCA.listarProdutos(); // listar produtos
                }else if( op == 6){
                    System.out.print("Informe o código: ");
                    codigo = scanner.nextInt();
                    System.out.println("\n");

                    Produto produto1 = RCA.getProdutoToCode(codigo);
                    System.out.println("Informe onde deseja alterar");
                    System.out.println("1 - Valor de compra");
                    System.out.println("2 - Custo");
                    System.out.println("3 - Margem de lucro");

                    int op1 = scanner.nextInt();

                    switch (op1) {
                        case 1:
                            System.out.print("Digite o novo valor de compra: ");
                            double vlCompra1 = scanner.nextDouble();

                            produto1.setValor(vlCompra1);
                            System.out.print("Valor de compra alterado para: " + vlCompra1 + "\n\n");
                        case 2:
                            System.out.print("Digite o novo custo: ");
                            double custo1 = scanner.nextDouble();

                            produto1.setCusto(custo1);
                            System.out.print(" Custo alterado para: " + custo1 + "\n\n");
                        case 3:
                            System.out.print("Digite a nova margem de lucro: ");
                            double margemLucro1 = scanner.nextDouble();
                            
                            produto1.setLucro(margemLucro1);
                            System.out.print("Margem de lucro alterada para: " + margemLucro1 + "\n\n");
                   }
                }  
            }
        System.out.println("Encerrando a venda...\n");
        }catch(Exception err){
            System.out.println("Erro interno.");
        }



    
    }
}
