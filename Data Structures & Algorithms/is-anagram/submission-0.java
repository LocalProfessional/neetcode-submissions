/** Valid Anagram
* Creates new char arrays of each string and sorts them. If the arrays are equal, the two strings are anagrams.
* @author Ahmad Saleh
* Sept 9th, 2026
**/

class Solution {
    public boolean isAnagram(String s, String t) {
        char[] arrayS = s.toCharArray(), arrayT = t.toCharArray();
        Arrays.sort(arrayS);
        Arrays.sort(arrayT);
        return Arrays.equals(arrayS, arrayT);
    }
}
