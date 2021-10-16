
public class MyConvertible implements Convertible {

    @Override
    public double toMile(double km) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        double mile = km * 0.621371;
        return mile;
    }

    @Override
    public String getCode(String rc) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        //rc = K2M762H2M = 9
        //012345678
        //0 - 3 = K2M
        //Cách 1:
//        String result = "";
//        for (int i = 0; i < rc.length(); i++) {
//            if ((i+1) % 3 == 0 && i != rc.length() - 1) {
//                result = result + rc.charAt(i) + "-";
//            } else {
//                result = result + rc.charAt(i);
//            }
//        }
//        return result;
        
        //Cách 2
//        String result = "";
//        for (int i = 0; i <= rc.length()-3; i+=3) {
//            result = result + rc.substring(i, i+3);
//            if(i != rc.length()-3){
//                result = result +"-";
//            }
//        }
//        return result;

    //In ra các kí tự trước dáu gạch 
    //VD : KCM - BCC
    //KCMD-LHML -> KCMD
    //KCMDL-LHMLM
    String []txt = rc.split("-");
    //KCM 0
    //BCC 1
    //ABC 2
    String result = txt[1];
//    String result = "";
//    int index = 0;
//        for (int i = 0; i < rc.length(); i++) {
//            if (rc.charAt(i) == '-') {
//                index = i;
//            }
//        }
//        for (int i = 0; i < index ; i++) {
//            result = result + rc.charAt(i);
//        }
        return result;
    }

}
