package com.geeksforgeeks.basic.strings;


import java.util.Arrays;

/*
Given two strings A and B. Find the characters that are not common in the two strings.

Note :- Return the string in sorted order.

Example 1:

Input:
A = geeksforgeeks
B = geeksquiz
Output: fioqruz
Explanation:
The characters 'f', 'i', 'o', 'q', 'r', 'u','z'
are either present in A or B, but not in both.
 */
// Java implementation to find the uncommon
// characters of the two strings
import java.util.*;

public class UncommonCharacters
{

    // function to find the uncommon characters
// of the two strings
    static void findAndPrintUncommonChars(String str1,
                                          String str2) {
        {
            // to store the answer
            String ans = "";

            // to handle the case of duplicates
            boolean[] used = new boolean[26];

            // check first for str1
            for (int i = 0; i < str1.length(); i++)
            {

                // keeping a flag variable
                boolean found = false;

                for (int j = 0; j < str2.length(); j++)
                {

                    // if found change the flag
                    // and break from loop
                    if (str1.charAt(i) == str2.charAt(j)) {
                        found = true;
                        break;
                    }
                }

                // if duplicate character not found
                // then add it to ans
//                System.out.println("Found is : "+found);
//                System.out.println("Not Found is : "+!found);
//                System.out.println(str1.charAt(i));
//                System.out.println((str1.charAt(i)-'a'));
//                System.out.println(used[str1.charAt(i) - 'a']);
//                System.out.println(!used[str1.charAt(i) - 'a']);
//                if (!found && !used[str1.charAt(i) - 'a']) {
//                    used[str1.charAt(i) - 'a'] = true;
//                    ans += str1.charAt(i);
//                }
            }

            // now check for str2
//            for (int i = 0; i < str2.length(); i++)
//            {
//
//                // keeping a flag variable
//                boolean found = false;
//
//                for (int j = 0; j < str1.length(); j++)
//                {
//
//                    // if found change the flag
//                    // and break from loop
//                    if (str2.charAt(i) == str1.charAt(j)) {
//                        found = true;
//                        break;
//                    }
//                }
//
//                // if duplicate character not found
//                // then add it to ans
//                if (!found && !used[str2.charAt(i) - 'a']) {
//                    used[str2.charAt(i) - 'a'] = true;
//                    ans += str2.charAt(i);
//                }
//            }

            // to match with output
            char tempArray[] = ans.toCharArray();

            // Sorting temp array using
            Arrays.sort(tempArray);
            ans = new String(tempArray);

            // if not found any character
            if (ans.length() == 0)
                System.out.println("-1");

                // else print the answer
            else
                System.out.println(ans + " ");
        }
    }

    public static void main(String args[]){
        findAndPrintUncommonChars("geeksforgeeks", "geeksquiz");
    }
}

