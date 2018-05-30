/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macstudent
 */
public class ArithmeticTest {
    public static void main (String args[]){
        Arithmetic operation1 = new Arithmetic();
        System.out.println("number : " + operation1.number1);
        
        operation1.addition();
        operation1.addition(20,34);
        float result = operation.addition(12.34f, 24.24f);
        System.out.println("result : " + result);
        operation.addition();
        
        
    };
    void addition(int n1, int n2){
        System.out.println("addition : " +(n1+n2));
        
    }
  float addition(float n1, float n2){
      return (n1+n2);
  }  
}
