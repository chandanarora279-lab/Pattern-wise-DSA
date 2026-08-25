// Title: Fruit Into Baskets
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/fruit-into-baskets/

            map.put(fruits[right],map.getOrDefault(fruits[right],0)+1);

            while(map.size()>2){
                map.put(fruits[left],map.get(fruits[left])-1);
                left++;
            }

                if(map.get(fruits[left]) == 0){
                    map.remove(fruits[left]);
                }
            ans=Math.max(ans,right-left+1);
        for(int right=0;right<fruits.length;right++){
        HashMap<Integer,Integer>map= new HashMap<>();
        int ans=0;
        int left=0;
    public int totalFruit(int[] fruits) {
class Solution {
