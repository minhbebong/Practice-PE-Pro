
public class Car {

    private String maker;
    private int price;

    public Car() {
        super();
    }

    public Car(String maker, int price) {
        super();
        this.maker = maker;
        this.price = price;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return maker + ", " + price;
    }

}
