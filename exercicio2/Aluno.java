public class Aluno{

  String nome, numeroMatricula;

  int idade;

public void imprimirDadosCadastrais(){

  System.out.println("Nome: " +this.nome);

  System.out.println("Idade:"  +this.idade);

  System.out.println("NumeroMatricula:"+this.numeroMatricula);

}

public static void main (String [] args){

  Aluno Laura = new Aluno();

  Laura.nome= "Laura";

  Laura.idade= 16;

  Laura.numeroMatricula= "165";

  Laura.imprimirDadosCadastrais();

  Aluno Thaminy = new Aluno();

  Thaminy.nome= "Thaminy";

  Thaminy.idade= 16;

  Thaminy.numeroMatricula= "100";

  Thaminy.imprimirDadosCadastrais();

  Aluno Bruna = new Aluno();

  Bruna.nome= "Bruna";

  Bruna.idade= 16;

  Bruna.numeroMatricula= "181";

  Bruna.imprimirDadosCadastrais();

  Aluno Layane = new Aluno();

  Layane.nome= "Layane";

  Layane.idade= 17;

  Layane.numeroMatricula= "111";

  Layane.imprimirDadosCadastrais();

  }

}
