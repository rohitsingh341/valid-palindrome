package com.rohit.dsa;

public class ValidPalindrome {
    public static void main( String[] args) {
        String s = "A man, a plan, a canal: Panama";
//        String s = "Ni tin";      //TRUE
//        String s = "a.";          //TRUE
//        String s = ".,";          //TRUE
        boolean palindrome = isPalindrome(s);
        System.out.println(s + " is palindrome - " + palindrome);
    }

    public static boolean isPalindrome(String s) {

      if (s.length() > 1) {
            int leftP = 0;
            int rightP = s.length()-1;

            while (leftP < rightP) {
                if (!Character.isLetterOrDigit(s.charAt(leftP))) {
                    leftP++;
                    continue;
                }
                else if (!Character.isLetterOrDigit(s.charAt(rightP))) {
                    rightP--;
                    continue;
                }
                else if (Character.toLowerCase(s.charAt(leftP)) != Character.toLowerCase(s.charAt(rightP))) {
                    return false;
                }
                leftP++;
                rightP--;
            }
        }
        return true;
    }
}
