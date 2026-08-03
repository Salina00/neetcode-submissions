class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
      Map<String, List<String>>res = new HashMap<>();
        for(String word : strs){
          int[] freq = new int[26];
          char[] chars = word.toCharArray();
          for(char c : chars){
          freq[c - 'a']++;
          }
          String key = Arrays.toString(freq);
          res.putIfAbsent(key, new ArrayList<>());
          res.get(key).add(word);
        }
        return new ArrayList<>(res.values());
    }
}
