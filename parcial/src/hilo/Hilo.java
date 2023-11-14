/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hilo;

/**
 *
 * @author madarme
 */
public class Hilo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        
        int i=0;
        while(i<=30)
        {
        
            Thread.sleep(5000);
            System.out.println("i:"+i);
            i++;
        }
    }
    
}
