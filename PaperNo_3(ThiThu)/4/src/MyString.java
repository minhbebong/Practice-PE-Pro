

import java.util.ArrayList;
import java.util.Collections;
public class MyString implements IString{

    @Override
    public int f1(String str) {
        str = str.replaceAll("[^2357]","");
        return str.length();
    }

    @Override
    public String f2(String str) {
        String word[] = str.split(" ");
        ArrayList<String> a = new ArrayList<>();
        for (String temp : word) {
            a.add(temp);
        }
        Collections.reverse(a);
        str = "";
        for (String string : a) {
            str+= string + " ";
        }
        return str.trim();
    }
    
}
