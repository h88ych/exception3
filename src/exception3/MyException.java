/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exception3;

/**
 *
 * @author Student
 */
public class MyException extends Exception {
    public MyException(String msg){
        super(); // must call parents class
    }
    public MyException(String msg){
        super(msg);
    }
}
