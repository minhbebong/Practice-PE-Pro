/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otherclass;

import otherclass.Animal;

/**
 *
 * @author macbookair
 */
public class Dog extends Animal{
    String color;
   
    void Voice(String Name, String Voice) {
        System.out.println("The Dog " + Name + " has the voice: " + Voice);
    }
    
    void Voice() {
        System.out.println("The voice of Dog: " + Voice);
    }

}
