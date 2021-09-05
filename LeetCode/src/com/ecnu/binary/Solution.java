package com.ecnu.binary;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @Author: yang
 * @CreateTime: 2021-09-05 09:51
 * @Description: 出现最多的元素
 */
public class Solution {

    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int allNumber = nums.length / 2;
        int count = 1;
        int value = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == value) {
                count++;
                if (count >= allNumber) {
                    return value;
                }
            } else {
                value = nums[i];
                count = 1;
            }
        }
        return -1;
    }

    public static int majorityElementV2(int[] nums) {
        Map<Integer, Integer> treeMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (treeMap.get(nums[i]) != null) {
                treeMap.put(nums[i], treeMap.get(nums[i]) + 1);
            } else {
                treeMap.put(nums[i], 1);
            }
        }
        int maxValue = 0;
        int maxKey=-1;
        for (Integer key : treeMap.keySet()) {
            int value = treeMap.get(key);
            if (value > maxValue) {
                maxValue = value;
                maxKey=key;
            }
        }

        return maxKey;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3,2,3};
        System.out.println(majorityElementV2(nums));
    }

}
