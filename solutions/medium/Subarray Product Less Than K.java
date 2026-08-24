// Title: Subarray Product Less Than K
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/subarray-product-less-than-k/

        return 0;
        int left=0;
        int prod=1;
        int count=0;

        for(int right=0;right<nums.length;right++){
            prod*=nums[right];
        }return count;
            count+=right-left+1;
            while(prod>=k){
               prod/=nums[left];
            }
    }
                left++;
        }
        if(k==1){
    public int numSubarrayProductLessThanK(int[] nums, int k) {
class Solution {
