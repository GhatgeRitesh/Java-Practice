package String_Problems;

import java.util.ArrayList;

public class indexOf_ValidWordLeetcode {
    // leetcode problem valid word -easy
    /*
    A word is considered valid if:

It contains a minimum of 3 characters.
It consists of the digits 0-9, and the uppercase and lowercase English letters. (Not necessary to have all of them.)
It includes at least one vowel.
It includes at least one consonant.
You are given a string word.

Return true if word is valid, otherwise, return false.

Notes:

'a', 'e', 'i', 'o', 'u', and their uppercases are vowels.
A consonant is an English letter that is not a vowel.


Example 1:

Input: word = "234Adas"

Output: true

Explanation:

This word satisfies the conditions.

Example 2:

Input: word = "b3"

Output: false

Explanation:

The length of this word is fewer than 3, and does not have a vowel.

Example 3:

Input: word = "a3$e"

Output: false

Explanation:

This word contains a '$' character and does not have a consonant.



Constraints:

1 <= word.length <= 20
word consists of English uppercase and lowercase letters, digits, '@', '#', and '$'.
     */
    public static void main(String[] args) {
        String word="Rt123";
        String word1="rtsh";

        System.out.println(checkWord(word));
        System.out.println(checkWord(word1));
    }

    public static Boolean checkWord(String word)
    {
        if(word.length()<3)
        {
            return false;
        }
        int vow=0;
        int con=0;
        ArrayList<Integer> list=new ArrayList<>();
        for(char c:word.toCharArray())
        {
            if(!Character.isLetterOrDigit(c))
            {
                return false;
            }
            list.add("aeiouAEIOU".indexOf(c));
            if("aeiouAEIOU".indexOf(c)!=-1)
            {
                vow++;
            }
            if((c>='a' && c<='z' || c>='A' && c<='Z') && "aeiouAeiou".indexOf(c)==-1)
            {
                con++;
            }
        }
        System.out.println(vow +" :vow "+con+":Cons " );
        System.out.println(list.toString() + " List ");
        return vow>0 && con>0 ;
    }
}
