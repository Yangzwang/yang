package com.ecnu.binary;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @Author: yang
 * @CreateTime: 2019-12-18 21:57
 * @Description: 搜索插入位置
 */
public class SearchInsert {
    public static void main(String[] args) {

        Set<String> set1 = new HashSet<String>() {
            {
                add("王者荣耀");
                add("英雄联盟");
                add("穿越火线");
                add("地下城与勇士");
            }
        };
        Set<String> set=new HashSet<>();
        set.add("王者荣耀");
        set.add("气人");
        set.addAll(set1);
        for (String s : set) {
            System.out.println(s);

        }


    }

    public int searchInsert(int[] nums, int target) {
        Arrays.sort(nums);
        int i=0,j=nums.length-1;
        int k=0;
        while (i<j){
           int b= (i+j)/2;
           if(nums[b]==target){
               k=b;
               break;
           }else if(nums[b]<target){
             i=b;
           }else {
               i=j;
           }
        }
           if(nums[i]>=target){
               k=i;
           }if(nums[i]>target){
        }
        return  0;
    }
}
