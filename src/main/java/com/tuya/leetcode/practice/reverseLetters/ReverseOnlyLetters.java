package com.tuya.leetcode.practice.reverseLetters;

/**
 * 给你一个字符串 s ，根据下述规则反转字符串：
 *
 * 所有非英文字母保留在原有位置。
 * 所有英文字母（小写或大写）位置反转。
 * 返回反转后的 s 。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：s = "ab-cd"
 * 输出："dc-ba"
 * 示例 2：
 *
 * 输入：s = "a-bC-dEf-ghIj"
 * 输出："j-Ih-gfE-dCba"
 * 示例 3：
 *
 * 输入：s = "Test1ng-Leet=code-Q!"
 * 输出："Qedo1ct-eeLg=ntse-T!"
 *  
 *
 * 提示
 *
 * 1 <= s.length <= 100
 * s 仅由 ASCII 值在范围 [33, 122] 的字符组成
 * s 不含 '\"' 或 '\\'
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-only-letters
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class ReverseOnlyLetters {

    public static String reverseOnlyLetters(String s) {

        //直接两个下表，一个从最后一位，一个从第一位往中间跑
        //如果非字母下标加一位、减一位
        //如果是字母，调换位置
        char[] chars = s.toCharArray();
        int size = chars.length;
        int fistIndex=0,lastIndex=size-1;
        for (int i=0;i<size;i++) {
            if (fistIndex>=lastIndex){
                break;
            }
            boolean fistLetter = Character.isLetter(chars[fistIndex]);
            boolean lastLetter = Character.isLetter(chars[lastIndex]);
            if (fistLetter && lastLetter){
                char flag = chars[lastIndex];
                chars[lastIndex] = chars[fistIndex];
                chars[fistIndex] = flag;
                fistIndex++;
                lastIndex --;
                continue;
            }
            if (!fistLetter){
                fistIndex++;
            }
            if (!lastLetter){
                lastIndex--;
            }
        }

        return String.valueOf(chars);

    }



}
