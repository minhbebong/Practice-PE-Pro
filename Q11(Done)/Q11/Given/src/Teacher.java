public class Teacher {
    String name;
    double salary;

    public Teacher() {
    }

    public Teacher(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        //return name.toUpperCase();
        //return name.toLowerCase();//tra chu thuong
//        name = name.toLowerCase();
//        name = name.replace(name.charAt(0),
//                       Character.toUpperCase(name.charAt(0)));
//        Character.toUpperCase(name.charAt(0));//ki tu dau tien viet hoa
//        for (int i = 0; i < name.length(); i++) {
//            if(name.charAt(i)==' '){
//                
//               name = name.replace(name.charAt(i+1),
//                       Character.toUpperCase(name.charAt(i+1)));
//            }
//        }  
//        return name;
//hàm trả về 2,3,4 kí tự đầu tiên(cuối cùng ) của name
       // return name.substring(1, 4);
       /*
       char[] ch = this.name.toCharArray();
       this.name= " ";
        for (int i = ch.length - 1; i >= 0; i--) {
            this.name += ch[i];
        }
        return name;
        */
       this.name = this.name.trim();
       String arr[] = this.name.split(" ");
       this.name = " ";
        for (String word : arr) {
            String newWord = word.toLowerCase();
            if (newWord.length() > 0) {
                newWord = newWord.replaceFirst(newWord.charAt(0), name);
            }
        }
        return null;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return  name + "\t" + salary ;
    }
    
    
}
