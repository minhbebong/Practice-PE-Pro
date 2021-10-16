
public class Computer {
    String name;
    String color;
    double price;

    public Computer() {
    }

    public Computer(String name, String color, double price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return  name + " " + price + " " + color ;
    }

    public String getColor() {
        return color;
    }
    
    
}
