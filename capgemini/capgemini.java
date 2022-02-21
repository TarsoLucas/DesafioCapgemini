package capgemini;
import java.util.Scanner;

public class capgemini {
	/*******************************************************************/
	//  		SIGNIFICADO DA STRING DE REGRAS                  		/
	//	#0            #1          #2          #3         #4         	/
	//-----------  -----------  ---------   --------   --------      	/
	//|MAIÚSCULAS| |MINUSCULAS| |SÍMBOLOS|  |NÚMEROS|  |TAMANHO|      	/
	//-----------  -----------  ---------   --------   --------       	/
	/*******************************************************************/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		    Scanner sc = new Scanner (System.in);
		    int n;
		    n = sc.nextInt();
		    for(int i = 0 ; i < n ; i++){
		      System.out.printf("*");
		      if(i==0)  
		    	  System.out.println("");
		      for(int j = 0 ; j < i ; j++){
		    	if(i==0) {
		    		break;
		    	}
		        System.out.printf(" *");
		        if(j==i-1)  System.out.println("");}
		     
		    }

		    sc.close();
		  } 
		}
