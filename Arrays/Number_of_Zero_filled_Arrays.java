class Solution {
    public long zeroFilledSubarray(int[] A) {
        int n=A.length;
        long count=0;
        long cons=0;
        for(int i=0;i<n;i++){
            if(A[i]==0) cons++;
            else cons=0;
            count+=cons;
        }
        return count;
    }
}
