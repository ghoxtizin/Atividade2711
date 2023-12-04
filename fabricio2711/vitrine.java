import java.util.ArrayList;
class Vitrine{

  public static void exibirVitrine(ArrayList<Produto> listaProdutos){
    for (Produto i : listaProdutos){
      System.out.println("---------------------------");
      System.out.println("ID " + i.id);
      System.out.println("Nome: " + i.nome);
      System.out.println("Valor: " + i.valor);
      System.out.println("---------------------------");
    }
  }
}

