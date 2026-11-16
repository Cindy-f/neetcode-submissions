class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> result = new HashMap<>();
        for (String str: strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);
            result.putIfAbsent(sortedStr, new ArrayList<>());
            result.get(sortedStr).add(str);
        }
        return new ArrayList<>(result.values());
    }
}
