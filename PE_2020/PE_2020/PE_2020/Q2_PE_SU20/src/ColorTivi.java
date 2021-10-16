
public class ColorTivi extends Tivi {

    int series;

    public ColorTivi() {
        super();
    }

    public ColorTivi(String type , int series, double price) {
        super(type, price);
        this.series = series;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    @Override
    public double getPrice(){
        double price1 = super.getPrice();
        if(series > 3000){
            return price1 * 0.9;
        }
        return price1;
    }
    @Override
    public String toString() {
        return type + "\t" + series + "\t" + price;
    }
    
}
