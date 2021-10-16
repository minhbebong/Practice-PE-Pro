/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author phuong
 */
public class Vase {

    private String maker;
    private int type;

    public Vase() {
    }

    public Vase(String maker, int type) {
        this.maker = maker;
        this.type = type;
    }

    public String getMaker() {
        return maker;
    }

    public int getType() {
        return type;
    }

    @Override
    public String toString() {
        return maker + "\t" + type;
    }

}
