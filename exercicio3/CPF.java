import java.util.Scanner;

public class CPF{
    
    public int[] vetorInt = new int[11];
    
    public void lerCPF(){
    
        
        
        Scanner input=new Scanner(System.in);
        System.out.println("Digite os nove primeiros numeros do seu cpf: ");
        String cpf=input.next();
        
        int tamanho=cpf.length();
        for (int i=0;i<tamanho;i++){
            char caracter=cpf.charAt(i);
            vetorInt[i]= Character.getNumericValue(caracter);
            
        }       
       
    }
    
    public void soma(){
        int peso=10, somaVet=0, x=0, r=0;
        for (int i=0;i<=8;i++){
            somaVet+=vetorInt[i]*peso;
            peso--;
        }
        
        System.out.println (somaVet);
        r=somaVet%11;
        if (r<2)
            x=0;
        else 
            x=11-r;
        
        System.out.println("O x eh: "+x);
        
        vetorInt[9]=x;
        
    }
    
    public void soma2(){
        int peso=11, somaVet2=0, y=0, r2=0;
        for (int i=0;i<=9;i++){
            somaVet2+=vetorInt[i]*peso;
            peso--;
        }
        System.out.println (somaVet2);
        r2=somaVet2%11;
        if (r2<2)
            y=0;
        else 
            y=11-r2;
        
        System.out.println("O y eh: "+y);
        vetorInt[10]=y;
    }
    
    
    

    
    
    
    public static void main (String [] args){
     
        CPF cpf=new CPF();
        cpf.lerCPF();
        cpf.soma();
        cpf.soma2();
        
        for (int i=0;i<=10;i++){
        System.out.print(cpf.vetorInt[i]);
        }
    
    }
    
}

