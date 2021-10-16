
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author phuong
 */
public class MyVase implements IVase {

    @Override
    public int f1(List<Vase> t) {
        int count = 0;
        for (Vase vase : t) {
            if (vase.getMaker().startsWith("B") && vase.getMaker().endsWith("A")) {
                count++;
            }
        }
        return count;
    }

    @Override
    public void f2(List<Vase> t) {
        List<Vase> t2 = new ArrayList<>();
        for (int i = 4; i >= 0; i--) {
            t2.add(t.get(i));
        }
        for (int i = 5; i < t.size(); i++) {
            t2.add(t.get(i));
        }
        t.clear();
        t.addAll(t2);
    }

    @Override
    public void f3(List<Vase> t) {
        int first = null;
        for (int i = 0; i < t.size(); i++) {
            if (t.get(i).getType() > 5) {
                first = i;
            }
        }
        for (int i = first + 1; i < t.size(); i++) {
            if (t.get(i).getType() > 5) {
                t.remove(i);
                break;
            }
        }
    }
}
