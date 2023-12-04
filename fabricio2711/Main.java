import java.util.Scanner;
import java.util.ArrayList;
//LOJA SERÁ A CLASSE MAIN
class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
    
ArrayList<ItemDoCarrinho> listaEscolhidos = new ArrayList<ItemDoCarrinho>();
    
  int opcao;

    do{
      System.out.println("(1) - Opções do admnistrador");
      System.out.println("(2) - Vitrine");
      System.out.println("(3) - Adicionar itens ao carrinho de compras");
      System.out.println("(4) - Ver Carrinho de compras");
      System.out.println("(5) - Comprar item");
      System.out.println("(6) - Sair");
      System.out.println("Escolha uma opção:");
       opcao = scanner.nextInt();


      switch(opcao){

        case 6:
          System.out.println("Você saiu da loja.");
          break;
          

        case 1://OPCOES DE ADM
          int opcaoAdm;
          System.out.println("(1) - Cadastrar Produto");
          System.out.println("(2) - Remover Produto");
          System.out.println("(3) - Mudar o preço de um Produto");
          System.out.println("(4) - Voltar");
          opcaoAdm = scanner.nextInt();

           switch(opcaoAdm){
              
        case 1://CADASTRANDO PRODUTO
          
            Produto produto = new Produto();


          scanner.nextLine();
          System.out.println("Insira o nome do produto:");
           produto.nome = scanner.nextLine();

          System.out.println("Insira o valor do produto");
           produto.valor = scanner.nextDouble();

           listaProdutos.add(produto);
          break;
               

        case 2://REMOVENDO PRODUTO
          System.out.println("Insira o Id do produto que deseja remover.");
            int idRemover = scanner.nextInt();
              
            boolean produtoRemovido = false;

              for(Produto p : listaProdutos){
                if(p.id == idRemover){
                  listaProdutos.remove(p);
                  produtoRemovido = true;
                  System.out.println("Produto removido com sucesso.");
                  break;
                }
              }
              if(!produtoRemovido){
                System.out.println("Produto não encontrado com ID fornecido.");
              }
              break;
               

        case 3:
              System.out.println("Insira o Id do produto que deseja alterar o preço.");
              int idAlterar = scanner.nextInt();
              boolean precoAlterado = false;

              for(Produto p : listaProdutos){
                if(p.id == idAlterar){
                  System.out.println("Insira o novo valor do produto.");
                  int novoPreco = scanner.nextInt();
                  p.valor = novoPreco;
                  precoAlterado = true;
                  System.out.println("Preço alterado com sucesso.");
                  break;
                }
              }
              if(!precoAlterado){
                System.out.println("Produto não encontrado com ID fornecido.");
              }

               
        case 4:
               break;
          }//FECHANDO SWITCH OPCOES ADM
          break;

          
        case 2:

         Vitrine vitrine = new Vitrine();

          Vitrine.exibirVitrine(listaProdutos);
          break;
          

        case 3:
          int opcaoCarrinho;
          do{
          
          System.out.println("(1) - Adicionar ao carrinho:");
          System.out.println("(2) - Voltar");
            opcaoCarrinho = scanner.nextInt();

        switch(opcaoCarrinho){
            

        case 1:
            
          ItemDoCarrinho itemCarrinho = new ItemDoCarrinho();

          System.out.println("Insira o ID do produto que você deseja adicionar ao carrinho.");
            itemCarrinho.idEscolhido = scanner.nextInt();
            System.out.println("Insira a quantidade desejada desse produto.");
            itemCarrinho.quantidadeEscolhida = scanner.nextInt();

            
            boolean produtoEscolhido = false;

            for(Produto p : listaProdutos){
              if(p.id == itemCarrinho.idEscolhido){
                listaEscolhidos.add(itemCarrinho);
                System.out.println("Produto adicionado ao carrinho.");
                produtoEscolhido = true;
                break;
              }
            }
          if (!produtoEscolhido){
            System.out.println("Produto não encontrado com ID fornecido.");
          }
           break;
            
          
        case 2:
           break;
      }
        
            
    }//Fechando do while do carrinho
     while(opcaoCarrinho != 2);

        case 4:

            Carrinho carrinho = new Carrinho();

           Carrinho.exibirCarrinho(listaProdutos, listaEscolhidos);
            break;

        case 5:

          int opcaoPagamento;
        do{
          System.out.println("Insira a forma de pagamento:");
            System.out.println("(1) - Dinheiro");
            System.out.println("(2) - Pix");
            System.out.println("(3) - parcelado 2x");
            System.out.println("(4) - parcelado 3x");
            System.out.println("(5) - Voltar");
               opcaoPagamento = scanner.nextInt();

          switch(opcaoPagamento){
            case 1:
            case 2:
              
            
         for (ItemDoCarrinho i : listaEscolhidos){
                for(Produto p : listaProdutos){
            System.out.println("Pagamento à vista = 10% desconto");
            System.out.println("---------------------------");
            System.out.println("ID: " + i.idEscolhido);
            System.out.println("Nome: " + p.nome);
            System.out.println("Valor:" + p.valor);
            System.out.println("Quantidade: " + i.quantidadeEscolhida);
            System.out.printf("Total: R$ %.2f%n" , ((p.valor * i.quantidadeEscolhida) - (p.valor * i.quantidadeEscolhida) * 0.10));
             }
           }
              break;
                  
        case 3:

              for (ItemDoCarrinho i : listaEscolhidos){
                for(Produto p : listaProdutos){
             
              System.out.println("---------------------------");
              System.out.println("ID: " + i.idEscolhido);
              System.out.println("Nome: " + p.nome);
              System.out.println("Valor:" + p.valor);
              System.out.println("Quantidade: " + i.quantidadeEscolhida);
              System.out.printf("Total: 2 VEZES DE R$ %.2f%n" , (p.valor * i.quantidadeEscolhida)/2);
              System.out.println("---------------------------");
                  
                }
            }
              break;

            case 4:

              for (ItemDoCarrinho i : listaEscolhidos){
                for(Produto p : listaProdutos){

              System.out.println("---------------------------");
              System.out.println("ID: " + i.idEscolhido);
              System.out.println("Nome: " + p.nome);
              System.out.println("Valor:" + p.valor);
              System.out.println("Quantidade: " + i.quantidadeEscolhida);
              System.out.printf("Total: 3 VEZES DE R$ %.2f%n" , (p.valor * i.quantidadeEscolhida)/3);
              System.out.println("---------------------------");
                }
              }
              break;
      
              
          }//fechando switch do pagamento
          } //fechando do while do pagamento
          while(opcaoPagamento != 5);
     }//fechando switch
    }//Fechando do while
     while(opcao != 6);

     scanner.close();
  }
}

