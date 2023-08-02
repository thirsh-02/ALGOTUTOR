class Solution {
    public int longestValidParentheses(String s) {
        int o=0,c=0;
        int mx=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(')
            o++;
            else
            c++;
            if(o==c){
                int len=o+c;
                mx=Math.max(mx,len);
            }
            else if(c>o){
                o=c=0;
            }
        }
        o=c=0;
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            if(ch=='(')
            o++;
            else
            c++;
            if(o==c){
                int len=o+c;
                mx=Math.max(mx,len);
          }
          else if(o>c){
              o=c=0;
          }
        }
        return mx;
    }
}