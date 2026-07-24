class Solution {
    public String simplifyPath(String path) {
        Stack<String> st=new Stack<>();
        String[] parts=path.split("/");
        for(String s:parts){
            if(s.equals("") || s.equals(".")) continue;
            if(s.equals("..")){
                if(!st.isEmpty()) st.pop();
            }else st.push(s);
        }
        if(st.isEmpty()){
            return "/";
        }
        StringBuilder res=new StringBuilder();
        List<String> l=new ArrayList<>();
        while(!st.isEmpty()){
            l.add(st.pop());
        }
        for(int i=l.size()-1;i>=0;i--) res.append("/").append(l.get(i));
        return res.toString();
    }
}