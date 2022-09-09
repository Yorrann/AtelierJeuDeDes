/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manu;

/**
 *
 * @author TEREOPA Manuarii
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        De de;
        de = new De();
        de.lancer();
        System.out.println(de.toString());
        de.lancer();
        System.out.println(de.toString());
        de.lancer();
        System.out.println(de.toString());
           
        De de1 = new De(3,6);
        de1.lancer();
        System.out.println(de1.toString());

        De pipes;
        pipes = new De();
        pipes.piper();
        pipes.lancer();
        System.out.println(pipes.toString());
        pipes.piper();
        pipes.lancer();
        System.out.println(pipes.toString());
        pipes.piper();
        pipes.lancer();
        System.out.println(pipes.toString());

    }

}
