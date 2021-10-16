
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class MyFan implements IFan{

    @Override
    public void f1(List<Fan> a, String code) {
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).getCode().contains(code)) {
                a.removeAll((Collection<?>) a.get(i));
                
            }
        }
       
    }

    @Override
    public int f2(List<Fan> a, double price) {
        int count = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).price <= price) {
                count ++;
            }
        }
        return count;
    }

    @Override
    public void f3(List<Fan> a, double price) {
        
    }

    
    
}
