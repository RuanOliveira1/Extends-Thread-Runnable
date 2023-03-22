/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package extends_thread_runnable;

/**
 *
 * @author ruana
 */
public class Extends_Thread_Runnable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Thread t1 = new Thread(new Trabalhador("chinelo", 100));
        Thread t2 = new Thread(new Trabalhador("sandalia", 500));
    }

}
