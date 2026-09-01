class Solution {
    public int removeDuplicates(int[] A) {
        Set<Integer> seen = new HashSet<>();
        for (int num : A) {
            seen.add(num);
        }
        List<Integer> unique = new ArrayList<>(seen);
        Collections.sort(unique);
        for (int i = 0; i < unique.size(); i++) {
            A[i] = unique.get(i);
        }
        return unique.size();   
    }
}
