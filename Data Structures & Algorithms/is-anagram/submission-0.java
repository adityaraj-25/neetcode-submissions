class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()==t.length()){
            char[] s1 = s.toCharArray();
            char[] t1 = t.toCharArray();
            Arrays.sort(s1);
            Arrays.sort(t1);
            int count=0;
            for(int i=0;i<s.length();i++){
                if(s1[i]==t1[i]){
                    count++;
                }
            }
            if(count==s1.length){
                return true;
            }
        }
        return false;
    }
}