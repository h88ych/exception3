/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exception3;

public class LAB2 {
    public static void main(String[] args) {
        int[] list = new int[5];
        try{
        System.out.println(list[5]);
        
        }catch(ArithmeticException e){
            System.out.println("ArithmeticException"); 
        }catch(RuntimeException e){
            System.out.println("RuntimeException");
        }catch(Exception ex){
            
        }
    }
}
