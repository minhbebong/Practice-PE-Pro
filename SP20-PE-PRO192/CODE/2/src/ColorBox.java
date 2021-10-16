public class ColorBox extends Box{
    int color;

    public ColorBox() {
    }

    public ColorBox( String code, double price,int color) {
        super(code, price);
        this.color = color;
    }

    public int getColor() {
        return color;
    }
    public double getNewPrice(){
        if (color > 100) {
            return 1.1 * super.getPrice();
        }
        return super.getPrice();
    }

    @Override
    public String toString() {
        return  code + "\t" + price +"\t"+ color ;
    }
    
    
}
