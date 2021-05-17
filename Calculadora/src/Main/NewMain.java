/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Pojo.Calculadora;
import java.util.Scanner;

/**
 *
 * @author FAMILIASOZAORTIZ
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a;
        int b;
        Calculadora c;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escriba 1 numero");
        a = sc.nextInt();
        
        System.out.println("Escriba 2 numero");
        b = sc.nextInt();
        
        c = new Calculadora(a, b);
        
        System.out.println("La suma es: " + c.suma());
        
        System.out.println("La resta es: "+c.resta());
        
    }
    
}
