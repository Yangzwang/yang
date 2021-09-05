package com.ecnu;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Author: yang
 * @CreateTime: 2020-05-02 22:14
 * @Description: 无重复字符的最长子串
 */
public class NoRepeat {
   /* public static void main(String[] args) {
        System.out.print(lengthOfLongestSubstring("pwwkew"));
    }*/

    public static void main(String[] args) throws Exception {


        String z = new String("string");
        String x = "string";
        String y = "string";

        System.out.println(x.equals(y)); // true
        System.out.println(x.equals(z)); // false

        Integer integer= -129;
        Integer integer1=-129;
        List<String> strings=new ArrayList<>();
        System.out.println(integer==integer1); // true
    }


    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() < 1) {
            return 0;
        }
        List<String> list=new ArrayList<>();
        int Max = 1;
        int K = 1;
        char[] chars = s.toCharArray();
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < chars.length; i++) {
            if (K > Max) {
                Max = K;
            }
            K = 1;
            set.clear();
            set.add(chars[i]);
            for (int j = i + 1; j < chars.length; j++) {
                if (set.contains(chars[j])) {
                    break;
                }
                K++;
                set.add(chars[j]);
            }

        }

        return Max;
    }

}
