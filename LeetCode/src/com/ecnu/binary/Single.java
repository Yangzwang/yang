package com.ecnu.binary;

import java.util.Arrays;


public class Single {


    public static  int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int value = nums[0];
        for(int i=1; i<nums.length;i++){
            if(value!=nums[i]){
                if(i%2==1) {
                    return value;
                }
                value = nums[i];
            }
        }
        return nums[nums.length-1];

    }


    public static void main(String[] args) throws InterruptedException {
        int [] nums=new int[]{13,12,13,11,11};
        System.out.println(singleNumber(nums));
    }
}