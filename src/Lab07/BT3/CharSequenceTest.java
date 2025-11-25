package Lab07.BT3;

import java.util.Scanner;

public class CharSequenceTest {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        ReverseCharSequence rcs = new ReverseCharSequence(sentence);
        
        System.out.println("Chuỗi gốc: " + sentence); 
        System.out.println("1. toString() (Đảo ngược): " + rcs); 
        System.out.println("2. length(): " + rcs.length()); 
        System.out.println("3. charAt(1): " + rcs.charAt(1));
        System.out.println("4. subSequence(0, 4): " + rcs.subSequence(0, 4));
    }
}