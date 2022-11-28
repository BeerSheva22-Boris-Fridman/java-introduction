package telran.text;

import java.util.Arrays;

public class split {
    public static void main(String[] args) {
        String str = "2+5+6+9+8";
       // char [] arr1 = str.toCharArray();
    String[] digits = str.split("\\+");
    String[] znaki = str.split("\\d");
       
            System.out.println(Arrays.toString(digits));
            System.out.println(digits.length);
            System.out.println(Arrays.toString(znaki));
            System.out.println(znaki.length);
    //        System.out.println(str.length());
        }
    }

