
import java.util.Collections;
import java.util.List;


public class MyBicycle implements IBicycle{

    @Override
    public void f1(List<Bicycle> a) {
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).getName().toLowerCase().contains("a")) {
                a.remove(i);
                break;
            }
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int f2(List<Bicycle> a, String name) {
        int count = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).getName().contains("a")) {
                count++;
            }
        }
        return count;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
