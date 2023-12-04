class Produto{
  static int proximoId = 1;

  String nome;
  double valor;
  int id;

  public Produto(){
    this.id = proximoId++;
  }
}