
public class VNCar extends Car {

    int series;

    public VNCar() {
    }

    public VNCar(String name, double price, int series) {
        super(name, price);
        this.series = series;
    }

    public double getSalePrice() {
        if(series < 300){
            return 1.1 * super.getPrice();
        }
        return price;
    }



    @Override
    public String toString() {
        return "series=" + series ;
    }

    
    

}
