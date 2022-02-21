package capgemini;

import java.util.Scanner;

/*******************************************************************/
//  		SIGNIFICADO DA STRING DE REGRAS                  		/
//	#0            #1          #2          #3         #4         	/
//-----------  -----------  ---------   --------   --------      	/
//|MAIÚSCULAS| |MINUSCULAS| |SÍMBOLOS|  |NÚMEROS|  |TAMANHO|      	/
//-----------  -----------  ---------   --------   --------       	/
/*******************************************************************/

public class ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String senha;
		int regras[] = new int[5];
		int CaracteresFaltantes=0;
		int VerificarString=0;
		int StringFaltante=0;
        char caracter;
        senha = sc.next();
   //     System.out.println(senha.length());
        for(int i = 0 ; i<senha.length(); i++){
            caracter = senha.charAt(i);
            int ascii = (int) caracter;
            //-------------------------------------------------------------------------
            if(ascii >= 65 && ascii <= 90)  regras[0]=1; //LETRAS MAIUSCULAS
            //-------------------------------------------------------------------------
            if(ascii >= 97 && ascii <= 122)  regras[1]=1; //LETRAS MINUSCULAS
            //----------------------------------------------------------------------------------------------------------------------------------------
            if(ascii == 33 || ascii == 64 || (ascii >= 35 && ascii <= 38) || ascii == 42 || ascii == 40 || ascii == 41 || ascii == 43 || ascii == 45 )  
                regras[2]=1; //SÍMBOLOS ☝️
            //----------------------------------------------------------------------------------------------------------------------------------------
            if(ascii >= 48 && ascii <= 57)  regras[3]=1; //NÚMEROS
            //-------------------------------------------------------------------------
            if(senha.length()>=6) //TAMANHO DA STRING
                regras[4]=1; 
            //-------------------------------------------------------------------------
            else{
                if(VerificarString==0){
                    StringFaltante=6-senha.length();
                    VerificarString=1;}
                }
            }
        for(int i = 0 ; i < 5 ; i++){
            if(regras[i] != 1)    CaracteresFaltantes++;
        }
        if(StringFaltante>=CaracteresFaltantes) System.out.println(StringFaltante); 
        else    System.out.println(CaracteresFaltantes);
        sc.close();
	    }
	}
