/*
	Given two binary strings, return their sum (also a binary string).

	For example,
	a = "11"
	b = "1"
	Return "100".
*/

public class AddBinary2 
{
	public static String addBinary(String a, String b) 
    {
        String res = "";
        boolean carry = false;
        int length = a.length() > b.length() ? b.length():a.length();
        for (int i=0; i<length; i++) {
            if (carry == true) {
                if (a.charAt(a.length()-i-1) == '1' && b.charAt(b.length()-i-1) == '1') {
                    res = "1" + res;
                } else if (a.charAt(a.length()-i-1) == '1' || b.charAt(b.length()-i-1) == '1') {
                    res = "0" + res;
                } else {
                    res = "1" + res;
                    carry = false;
                }
            } else {
                if (a.charAt(a.length()-i-1) == '1' && b.charAt(b.length()-i-1) == '1') {
                    res = "0" + res;
                    carry = true;
                } else if (a.charAt(a.length()-i-1) == '1' || b.charAt(b.length()-i-1) == '1') {
                    res = "1" + res;
                } else {
                    res = "0" + res;
                }
            }
        }
        String rest = a.length() > b.length() ? a.substring(0,a.length() - length) : b.substring(0,b.length() - length);
        for (int i=0; i<rest.length(); i++) {
            if (carry == true) {
                if (rest.charAt(rest.length()-i-1) == '1') {
                    res = "0" + res;
                } else {
                    res = "1" + res;
                    carry = false;
                }
            } else {
                if (rest.charAt(rest.length()-i-1) == '1') {
                    res = "1" + res;
                } else {
                    res = "0" + res;
                }
            }
        }
        if (carry == true) {
            res = "1" + res;
        }
        return res;
    }
}