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

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String maker() {
        return maker;
    }

    public int type() {
        return type;
    }
}
