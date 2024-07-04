class Solution {
    public List<String> commonChars(String[] words) {
        HashMap <Character, Integer> map = new HashMap<>();
        for(char ch : words[0].toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for(int i = 1; i < words.length; i++){
            HashMap <Character, Integer> temp = new HashMap<>();
            for(char ch : words[i].toCharArray()){
                temp.put(ch, temp.getOrDefault(ch, 0) + 1);
            }
            for(char ch : map.keySet()){
                map.put(ch, Math.min(map.get(ch), temp.getOrDefault(ch, 0)));
            }
        }
        List<String> res = new ArrayList<>();
        for(char ch : map.keySet()){
            for(int i = 0; i < map.get(ch); i++){
                res.add(String.valueOf(ch));
            }
        }
        return res;
    }
}