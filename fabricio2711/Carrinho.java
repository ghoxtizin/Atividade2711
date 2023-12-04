import java.util.ArrayList;
class Carrinho{

   public static void exibirCarrinho(ArrayList<Produto> listaProdutos, ArrayList<ItemDoCarrinho> listaEscolhidos) {
    for (ItemDoCarrinho i : listaEscolhidos){
      for(Produto p : listaProdutos){
      System.out.println("CARRINHO DE COMPRAS");
      System.out.println("---------------------------");
      System.out.println("ID: " + i.idEscolhido);
      System.out.println("Nome: " + p.nome);
      System.out.println("Valor:" + p.valor);
      System.out.println("Quantidade: " + i.quantidadeEscolhida);
      System.out.println("Total: " + (p.valor * i.quantidadeEscolhida));
      System.out.println("---------------------------");
    }
    }
  }
}