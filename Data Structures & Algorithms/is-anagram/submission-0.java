class Solution {
    public boolean isAnagram(String s, String t) {
        char[] s1=s.toCharArray();
        char[] s2=t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        String s3=String.valueOf(s1);
        String s4=String.valueOf(s2);
       
        return s3.equals(s4);
    }
}
