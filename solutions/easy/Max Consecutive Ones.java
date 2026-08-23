// Title: Max Consecutive Ones
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/max-consecutive-ones/

        while(j<n){
            if(nums[j]==1){
                current_count++;
            }
            else{
                Max_ans=Math.max(current_count,Max_ans);
            }
                current_count=0;
        }
        return Math.max(current_count,Max_ans);
        int n = nums.length;
        int j=0;
        int current_count = 0;
        int Max_ans = 0;
    public int findMaxConsecutiveOnes(int[] nums) {
class Solution {
    }
            j++;
}
