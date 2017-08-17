/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Alumno
 */
public class series {
    private int numero;
    private int factorial;
    private int[] fibonacci;
    
    public void setNumero(int numero){
        this.numero=numero;
    }
    public void calcFactorial(){
        factorial=1;
        for (int i = 1; i <= numero; i++) {
            factorial*=i; 
        }
        
    }
    public int getFactorial(){
        calcFactorial();
        return factorial;
    }
    
    public void calcFibonacci(){
        fibonacci=new int[numero];
        fibonacci[0]= 0;
        fibonacci[1]= 1;
        for (int i = 2; i < numero; i++) {
              
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2]; 
        }
    
    }
    public String getFibonacci(){
        calcFibonacci();
        String fibo= new String();
        for (int i = 0; i < fibonacci.length-1; i++) {
            fibo+=fibonacci[i]+", ";
        }
        fibo+=fibonacci[fibonacci.length-1]+"";
        return fibo;
    } 
    
}
