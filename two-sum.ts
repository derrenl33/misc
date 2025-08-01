// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

// You may assume that each input would have exactly one solution, and you may not use the same element twice.

// You can return the answer in any order.

function twoSum(nums: number[], target: number): number[] {
    if (nums.length == 2) {
        return [0,1];
    }else {
        for (let i = 0; i <= nums.length - 1; i++) {
            for (let j = i + 1; j <= nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return [i,j];
                }
            }
        }
    }
    return [];
};