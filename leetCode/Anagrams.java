/*
	Given an array of strings, return all groups of strings that are anagrams.

	Note: All inputs will be in lower-case.
*/

import java.util.*;

public class Anagrams
{
	public static ArrayList<String> anagrams(String[] strs) 
    {
        if (strs.length == 0) {
            return new ArrayList<String>();
        }
        ArrayList<String> res = new ArrayList<String> ();
        HashMap <String, String> hashMap = new HashMap<String, String> (); 
        Set<String> set = new HashSet<String> ();
        String sortedString;
        for (int i=0; i<strs.length; i++) {
            sortedString = getSortedString(strs[i]);
            if (set.contains(sortedString)){
                res.add(strs[i]);
            } else {
                set.add(sortedString);
                hashMap.put(sortedString, strs[i]);
            }
        }
        int length = res.size();
        String temp;
        for (int i=0; i<length; i++) {
            temp = getSortedString(res.get(i));
            if (hashMap.containsKey(temp)){
                res.add(hashMap.get(temp));
                hashMap.remove(temp);
            }
        }
        // System.out.println(res);
        // ArrayList<String> resClone = (ArrayList<String>)res.clone();
        // for (String temp:resClone) {
        //     String temp0 = getSortedString(temp);
        //     if (hashMap.containsKey(temp0)) {
	       //      res.add(hashMap.get(temp0));
	       //  }
        //     hashMap.remove(temp0);
        // }
        return res;
        
    }
    
    private static String getSortedString(String str) {
        char[] temp = str.toCharArray();
        Arrays.sort(temp);
        return new String(temp);
    }
}