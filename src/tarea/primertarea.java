package tarea;

import java.util.Scanner;
public class primertarea {
    
    public void imprimir(){
    Scanner sc = new Scanner (System.in);
    int n;
    String asteriscos = "*";
    String suma;
    suma = asteriscos;
        System.out.print("Cuantos asteriscos quieres Imprimir: ");
        n = sc.nextInt();
        
        for(int i=0; i<n; i++){
            System.out.println(suma);
            suma = suma + asteriscos;
        }
    }
}
