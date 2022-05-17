package com.mycompany.problemsolving;

/*Given an array of integers nums, you start with an initial positive value startValue.

In each iteration, you calculate the step by step sum of startValue plus elements in nums (from left to right).

Return the minimum positive value of startValue such that the step by step sum is never less than 1. */

public class solution {
    public static int minStartValue(int[] nums) {
        int minStart = 0;
        int minSum = 0;
        int currentSum = 0;
        
        for(int i = 0; i < nums.length; i++){
            currentSum += nums[i];
            if(minSum > currentSum){
                minSum = currentSum;
            }
        }
        
        minStart = 0 - minSum + 1;
        return minStart;
    }

    
    public static void main(String[] args){
        int nums[] = {-3,2,-3,4,2};
        int answer = minStartValue(nums);
        System.out.println(answer);
    }
}
