package generation;

import java.util.*;

public class decisao4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int numero;
       double res;
       
       Scanner ler = new Scanner(System.in);
       
       System.out.println("Entre com um n�mero: ");
       numero = ler.nextInt();
       
       if(numero%2==0)
       {
    	   res = Math.sqrt(numero);
    	   System.out.println("N�mero � PAR e a sua raiz quadrada � : "+res);
       }
       else
       {
    	   res = Math.pow(numero,2);
    	   System.out.println("N�mero � IMPAR e seu n�mero elevado ao quadrado �: "+res);
       }
	}

}
