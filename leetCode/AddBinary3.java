/*
    Given two binary strings, return their sum (also a binary string).

    For example,
    a = "11"
    b = "1"
    Return "100".
*/
import java.util.*;
public class AddBinary3
{
    public static String addBinary(String a, String b) {
        char[] input1 = a.toCharArray();
        char[] input2 = b.toCharArray();
        int length = Math.max(a.length(), b.length());
        Stack<Character> stack = new Stack<Character>();
        String res = "";
        int carry = 0;
        for (int i=0; i<length; i++) {
            int in1 = i<a.length() ? a.charAt(a.length()-i-1) - '0': 0;
            int in2 = i<b.length() ? b.charAt(b.length()-i-1) - '0': 0;
            char temp = (char) ((in1+in2+carry)%2 + '0');
            stack.push(temp);
            carry = (in1+in2+carry)/2;
        }
        if (carry == 1) {
            stack.push((char) (1 + '0')); // result to a char '1' or '0'
        }
        while (!stack.isEmpty()) {
            res += stack.pop();
        }
        return res;
    }
}