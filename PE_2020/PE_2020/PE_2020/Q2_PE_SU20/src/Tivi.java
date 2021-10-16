
public class Tivi {

    double price;
    String type;

    public Tivi(){
    }
    
    public Tivi(String type, double price) {
        this.price = price;
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type + "\t" + price;
    }
}
