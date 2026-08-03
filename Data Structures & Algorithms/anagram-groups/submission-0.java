class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
      Map<String, List<String>>res = new HashMap<>();
        for(String word : strs){
          char[] chars = word.toCharArray();
          Arrays.sort(chars);
          String key = new String(chars);
          res.putIfAbsent(key, new ArrayList<>());
          res.get(key).add(word);
        }
        return new ArrayList<>(res.values());
    }
}
