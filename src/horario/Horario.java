/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horario;

import java.util.Scanner;

/**
 *
 * @author TRUJEQUE
 */
public class Horario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
	        
	    String Dia = "lunes";
	    int NumHora;
	        
	        System.out.println("Añade un numero del 1 al 24 para tener su actividad");
	        NumHora = entrada.nextInt();
	        
	        switch (NumHora) {
	            case 1:
	                System.out.println("Levantarse para la clase de admi");
	                break; 
	            case 6:
	                System.out.println("Entrar a la clase de admi");
	                break;
	            case 7:
	                System.out.println("Desayunar");
	                break;
	            case 8:
	                System.out.println("Entrar a clase de organización de 8 a 10 am");
	                break;
	            case 9:
	                System.out.println("Entrar a clase de Física de 10 a 12");
	                break;
	            case 10:
	                System.out.println("Después de la clase de Física tomar un descanso");
	                break;
	            case 11:
	                System.out.println("Almorzar alas 2pm ");
	                break;    
	            case 12:
	                System.out.println("Realizar tarea de 3 a 4 pm");
	                break;
	            case 13:
	                System.out.println("Utilizar el celular en redes sociales");
	                break;
	            case 14:
	                System.out.println("Ayudar en la casa");
	                break;
	            case 15:
	                System.out.println("tener libre lo que resta de la tarde");
	                break;
	            case 16:
	                System.out.println("Bañarme");
	                break;    
	            case 17:
	                System.out.println("Cenar alas 9pm");
	                break;
	            case 18:
	                System.out.println("Y tener libre el resto de la noche");
	                break;
	            case 19:
	                System.out.println("Acostarme a dormir, hasta la mañana siguiente");
	                break;
	            default:
	                System.out.println("Desayunar");
                }
    }
    
}
