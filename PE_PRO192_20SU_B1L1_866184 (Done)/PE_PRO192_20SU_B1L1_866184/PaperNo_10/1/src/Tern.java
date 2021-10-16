/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author phuong
 */
public class Tern {

    private String food;
    private int type;

    public Tern() {
    }

    public Tern(String food, int type) {
        this.food = food;
        this.type = type;
    }

    public String getFood() {
        return food.toUpperCase();
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
