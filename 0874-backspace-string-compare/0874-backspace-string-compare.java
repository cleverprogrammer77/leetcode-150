class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();

        for(Character c : s.toCharArray()){
            if(c == '#'){
                if(!st1.isEmpty()){
                    st1.pop();
                }
            }else {
                st1.push(c);
            }
        }
        StringBuilder sb1 = new StringBuilder();
        for (Character c : st1) {
            sb1.append(c);
        }

        for(Character c : t.toCharArray()){
            if(c == '#'){
                if(!st2.isEmpty()){
                    st2.pop();
                }
            }else {
                st2.push(c);
            }
        }
        StringBuilder sb2 = new StringBuilder();
        for (Character c : st2) {
            sb2.append(c);
        }
        return sb1.toString().equals(sb2.toString());

    }
}