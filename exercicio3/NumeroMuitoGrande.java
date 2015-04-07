import java.util.Scanner;

public class NumeroMuitoGrande {

    public int[] vetor1 = new int[30];
    public int[] vetor2 = new int[30];
    public int[] soma = new int[30];
    public int[] resp1 = new int[30];
    
    String n1, n2;

    public void leNumero() {

        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro Número: ");
        n1 = input.next();
        System.out.println("Digite o segundo Número: ");
        n2 = input.next();

    }

    public void converte() {
        int tamanho1 = n1.length();
        for (int i=tamanho1, j=0; i>0; i--, j++) {
            char caracter = n1.charAt(j);
            vetor1[30-i] = Character.getNumericValue(caracter);
        }
        int tamanho2 = n2.length();
        for (int i = tamanho2, j=0; i>0; i--, j++) {
            char caracter = n2.charAt(j);
            vetor2[30-i] = Character.getNumericValue(caracter);
        }
    }

    public void soma() {

        int vai = 0, flag=0;

           for (int i=29; i>=0 ;i--){
            soma[i]= ((vetor1[i]+vetor2[i]+vai)%10);
            vai=((vetor1[i]+vetor2[i]+vai)/10);
            }
        
        System.out.print ("Resultado: ");
        for (int i = 0; i <= 29; i++) {
            if (soma[i]==0 && flag==0 ) {
                if (soma[i+1] != 0)
                    flag=1;
            }
            else 
                System.out.print(soma[i]);
        }
    }
    
    public void multiplicar() {
        int vai=0, flag=0;
        for (int i=29; i>=0; i--){
            int pos=i;
            for (int j=29;j>=0;j--){
                if (pos>=0){
                    resp1[pos]+= ((vetor1[i]*vetor2[j])+vai)%10;
                    vai=((vetor1[i]+vetor2[i]+vai)/10);
                }
            }
            pos--;
            
        
        }
        System.out.print ("Resultado: ");
        for (int i= 0; i <= 29; i++) {
            if (resp1[i]==0 && flag==0 ) {
                if (resp1[i+1] != 0)
                    flag=1;
            }
            System.out.print(resp1[i]);
        }
        
        
    }
    
    
 

    public static void main(String[] args) {

        NumeroMuitoGrande big = new NumeroMuitoGrande();
        big.leNumero();
        big.converte();
        big.soma();
        big.multiplicar();
    }

}
