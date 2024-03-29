class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> hm = new HashMap<>();
        if(s.length() != t.length()){
            return false;
        }
        for(int i = 0; i < s.length() ; i++){
            char ch = s.charAt(i);
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }
        for(int i = 0; i < t.length(); i++){
            char ch = t.charAt(i);
            if(hm.containsKey(ch) == false){
                return false;
            }else if(hm.get(ch) == 1){
                hm.remove(ch);
            }else {
                hm.put(ch, hm.get(ch) - 1);
            }
        }
        return hm.size() == 0;
    }
}