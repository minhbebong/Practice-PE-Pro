
public class MyString implements IString{
//f1 tính tổng số chẵn của chuỗi
    @Override
    public int sum(String rc) {
        int sum = 0;
        for (int i = 0; i < rc.length(); i++) {
            if ((rc.charAt(i) >= '0') && (rc.charAt(i) <= '9')) {
                if (rc.charAt(i) % 2 == 0) {
                    sum += rc.charAt(i) - '0';
                }
            }
        }
        return sum;
    }    

    @Override
    public String getCode(String rc) {
        for (int i = 0; i < rc.length(); i++) {
            if ((rc.charAt(i) >= '0') && (rc.charAt(i) <= '9') 
                    &&(rc.charAt(i) >= 'A') && (rc.charAt(i) <= 'Z')) {
                rc.charAt(i);
            }
        }
    }

   
}
