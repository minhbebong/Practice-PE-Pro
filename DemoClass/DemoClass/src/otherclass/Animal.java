/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otherclass;

/**
 *
 * @author macbookair
 */
public class Animal {
    private int ID;
    private String Name;
    private String Type;
    String Voice;

    public Animal() {
    }

    public Animal(int ID, String Name, String Type, String Voice) {
        this.ID = ID;
        this.Name = Name;
        this.Type = Type;
        this.Voice = Voice;
    }

    public String getVoice() {
        return Voice;
    }

    public void setVoice(String Voice) {
        this.Voice = Voice;
    }

    int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }
    
    void Voice(String Name, String Voice) {
        System.out.println("The animal: " + Name + " has the voice: " + Voice);
    }
    
    void Voice() {        
        System.out.println("The voice of animal: " + Voice);
    }
    
    
}
