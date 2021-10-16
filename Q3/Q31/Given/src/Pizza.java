
public class Pizza {
     /**
     * Parameter constructor     
     * @param diameter - value of diameter of Pizza
     * @param slice - value of number slices of Pizza
     */
//    public Pizza(double diameter, int slice) {
//        throw new UnsupportedOperationException(
//                "Remove this line and implement your code here!");
//    } 
    double diameter;
    int slices;

    public Pizza() {
    }

    public Pizza(double diameter, int slices) {
        this.diameter = diameter;
        this.slices = slices;
    }

    public double getDiameter() {
        return diameter;
    }

    public int getSlices() {
        return slices;
    }

    @Override
    public String toString() {
        return  diameter + "\t" + slices ;
    }
    
    
}
