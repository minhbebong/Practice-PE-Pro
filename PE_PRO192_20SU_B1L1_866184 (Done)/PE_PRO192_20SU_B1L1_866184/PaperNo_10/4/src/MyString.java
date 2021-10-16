/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author phuong
 */
public class MyString implements IString {

    @Override
    public int f1(String str) {
        String[] arr = str.split(" ");
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            char lastdigit = arr[i].charAt(arr[i].length() - 1);
            if (Character.isDigit(lastdigit)) {
                count++;
            }
        }
        return count;
    }

    @Override
    public String f2(String str) {
        String[] arr = str.split(" ");
        int shortest = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() < shortest) {
                shortest = arr[i].length();
                index = i;
            }
        }
        arr[index] = Integer.toString(shortest);
        str = "";
        for (int i = 0; i < arr.length; i++) {
            str += arr[i] + " ";
        }
        return str.trim();
    }
}
