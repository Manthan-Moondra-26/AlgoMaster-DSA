class Solution {
    public int majorityElement(int[] A) {
        int n = A.length;
        Arrays.sort(A);
        return A[n/2];
    }
}
