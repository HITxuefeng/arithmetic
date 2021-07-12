package org.afeng.structure.array;

import java.util.Arrays;

/**
 * @Author xuefeng
 * @Date 2021/7/9 5:20 下午
 */
public class ArrayTraverse {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] arrOut = traverse(arr);
        System.out.println(Arrays.toString(arrOut));
    }

    public static int[] traverse(int[] arr) {
        for(int i = 0; i < arr.length; i ++) {
            arr[i] += 1;
        }
        return arr;
    }
}
