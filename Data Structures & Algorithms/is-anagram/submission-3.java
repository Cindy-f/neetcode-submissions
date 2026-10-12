class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> map1 = getCharCount(s);
        Map<Character, Integer> map2 = getCharCount(t);
        for (int i = 0; i < s.length(); i++) {
            if (!map2.containsKey(s.charAt(i))) {
                return false;
            } else if (!map1.get(s.charAt(i)).equals(map2.get(s.charAt(i)))) {
                return false;
            }
        }
        return true;
    }

    private Map<Character, Integer> getCharCount (String str) {
        Map<Character, Integer> charCount = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (charCount.containsKey(str.charAt(i))) {
                charCount.put(str.charAt(i), charCount.get(str.charAt(i)) + 1);
            } else {
                charCount.put(str.charAt(i), 1);
            }
        }
        return charCount;
    }
}
