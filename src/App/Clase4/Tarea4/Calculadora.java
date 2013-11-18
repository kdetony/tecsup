package App.Clase4.Tarea4;

import java.util.Scanner;

public class Calculadora {
        public static void main(String[ ] ar) {
        Calculadora.ExcepcionCalculadora();
    }
    
    public static void ExcepcionCalculadora() {
        try {           
               
        Scanner sc = new Scanner(System.in);
        int a,b;
        double resultado;
        
        System.out.println("Ingresa base");
        a = sc.nextInt();
    
        System.out.println("Ingresa exponente"); 
        b = sc.nextInt();
        
        resultado = Math.pow(a,b);
        System.out.println("Resultado:" +" " + resultado);        
           
        } catch (Exception e) {
            System.out.println("Problema aritmetico:" + e.getMessage()) ;   /*Atrapando el ERROR*/
                e.printStackTrace();   /*Traza de Errores*/
                        }
        
                }        
    }

    
