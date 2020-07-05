/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividad;

	
public class iterativo {
 
    public static void main(String[] args) {
 
        int serie = 40, num1 = 0, num2 = 1, suma = 1;
 
        // Muestro el valor inicial
        System.out.println(num1);
         
        for (int i = 1; i < serie; i++) {
             
            // muestro la suma
            System.out.println(suma);
             
            //primero sumamos
            suma = num1 + num2;
            //Despues, cambiamos la segunda variable por la primera
            num1 = num2;
            //Por ultimo, cambiamos la suma por la segunda variable
            num2 = suma;
             
             
        }
    }
}