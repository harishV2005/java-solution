class Solution {
    public String removeDuplicates(String s) {
        Stack <Character> st =new Stack<>();
        char a [] =s.toCharArray();
        for(char q:a)
        {
            if(st.isEmpty())  st.push(q);
            else if(st.peek()==q) st.pop();
            else st.push(q);
        }  
        StringBuilder result = new StringBuilder();
        for (char c : st) {
            result.append(c);
        }

        return result.toString();
    }
}
