public class Calculadora{

	int variavel1, variavel2;
	
	public void soma (){
	
	int soma=0;
		soma= this.variavel1+this.variavel2;
		System.out.println("A soma eh: "+soma);
		
	}

	public void subtracao (){
	
	int subtracao=0;
		subtracao= this.variavel1-this.variavel2;
		System.out.println("A subtracao eh: "+subtracao);
		
	}

	public void multiplicacao (){
	
	int multiplicacao=0;
		multiplicacao= this.variavel1*this.variavel2;
		System.out.println("A multiplicacao eh: "+multiplicacao);
		
	}

	public void divisao(){
	
	int divisao=0;
		divisao= this.variavel1/this.variavel2;
		System.out.println("A divisao eh: "+divisao);
		
	}




	public static void main (String [] args){
		Calculadora c1= new Calculadora ();
		Calculadora c2= new Calculadora ();
		Calculadora c3= new Calculadora ();

		c1.variavel1=3;
		c1.variavel2=6;
		c2.variavel1=4;
		c2.variavel2=8;
		c3.variavel1=1;
		c3.variavel2=2;
		
		c1.soma();
    c1.subtracao();
    c1.divisao();
    c1.multiplicacao();
    c2.soma();
    c2.subtracao();
    c2.divisao();
    c2.multiplicacao();
    c3.soma();
    c3.subtracao();
    c3.divisao();
    c3.multiplicacao();
    

	
	}


}
