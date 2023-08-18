/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fibo;

/**
 *
 * @author Omar
 */
public class Operacion {

    public static int fibonaci(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibonaci(n - 1) + fibonaci(n - 2);
        }
    }
}
