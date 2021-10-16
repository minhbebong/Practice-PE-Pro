/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author phuong
 */
public class SpecVase extends Vase {

    private int color;

    public SpecVase() {
    }

    public SpecVase(int color) {
        this.color = color;
    }

    public SpecVase(String maker, int type, int color) {
        super(maker, type);
        this.color = color;
    }

    public int getNewType() {
        if (super.getMaker().startsWith("BA")) {
            return super.getType() + 20;
        } else {
            return super.getType() + 10;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\t" + color;
    }

}
