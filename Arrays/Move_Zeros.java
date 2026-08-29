class Solution {
    public void moveZeroes(int[] num) {
        int n = num.length;
        int left=0;
        for(int right=0;right<n;right++){
            if(num[right]!=0){
                int a = num[right];
                num[right] = num[left];
                num[left] = a;
                left++;
            }
        }
    }
}
