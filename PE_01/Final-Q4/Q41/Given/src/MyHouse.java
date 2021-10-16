
public class MyHouse implements House {

    int price;
    String address;

    public MyHouse(int price, String address) {
        this.price = price;
        this.address = address;
    }

    @Override
    public double getPricetoUSD() {
        return ((float) price / 23000);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getCode() {
        for (int i = 0; i < address.length(); i++) {
            if ((address.charAt(i) >= '0') && (address.charAt(i) <= '9')) {
                return address.substring(i, i + 3);
            }
            return address.substring(address.length() - 3, address.length());
        }
        return null;
    }

}
