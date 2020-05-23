package com.company;


public class TwoSum {

    public static void main(String[] args){
        int[] nums = {2, 11, 7, 15};
        int target = 9;
        int[] wow = twoSum(nums, target);

        System.out.println(wow[0] + " " + wow[1]);
    }


    public static int[] twoSum(int[] nums, int target) {

        int [] hits = new int[0];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target){
                    hits = new int[]{i,j};
                }
            }
        }
        return hits;
    }
}

