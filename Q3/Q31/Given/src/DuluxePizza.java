
public class DuluxePizza extends Pizza{
    /**
     * Parameter constructor
     * @param addedTopping - value of addedTopping of Pizza
     * @param diameter - value of diameter of Pizza
     * @param slice - value of number slices of Pizza
     */
//    public DuluxePizza(String addedTopping, double diameter, int slice) { 
//        super(diameter, slice);
//        //clean the code below and complete your solution
//        throw new UnsupportedOperationException(
//                "Remove this line and implement your code here!");
//    } 
    String addedToppings;

    public DuluxePizza() {
    }

    public DuluxePizza( String addedToppings ,double diameter, int slices) {
        super(diameter, slices);
        this.addedToppings = addedToppings;
    }

//    DuluxePizza( double diameter, int slices,String addedToppings) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    public String getAddedToppings() {
        return addedToppings;
    }

    @Override
    public String toString() {
        return  addedToppings + "\t" + diameter + "\t" + slices;
    }
    
    
}
