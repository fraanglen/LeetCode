
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        HashSet<Integer> occurrenceSet = new HashSet<>();
        for (int count : countMap.values()) {
            if (!occurrenceSet.add(count)) { 
                return false;
            }
        }
        return true;
    }
}
	