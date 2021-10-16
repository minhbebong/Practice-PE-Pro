
public class SComputer extends Computer{
    String series;

    public SComputer() {
    }


    public SComputer(String series, String name, String color, double price) {
        super(name, color, price);
        this.series = series;
    }
    public double getSalePrice() {
        if(series.contains("A") != true){
            
            return 0.95 * price;
        } else {
            
                return 0.9 * price;
        }
    }

    @Override
    public String toString() {
        return  name + " " + price + " " + color + " " + series ;
    }
    
}
