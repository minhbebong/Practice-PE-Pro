
import java.util.List;


/**
 *
 * @author alias
 */
public class MyPrinter implements IPrinter{

    @Override
    public void f1(List<Printer> a, double price) {
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i).getPrice() <= price){
                a.remove(i);
                i--;
            }
        }
    }

    @Override
    public int f2(List<Printer> a, String name) {
        int count = 0;
        for (Printer o : a) {
            if(o.getName().toUpperCase().contains(name.toUpperCase())){
                count++;
            }
        }
        return count;
        
    }

    
    
}
