import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class L2022211920_2_Test {

// 创建 Solution2 的实例
private final Solution2 solution = new Solution2();

@Test
void testRemoveDuplicateLetters() {
// 示例 1
String input1 = "bcabc";
String expectedOutput1 = "abc";
assertEquals(expectedOutput1, solution.removeDuplicateLetters(input1));

// 示例 2
String input2 = "cbacdcbc";
String expectedOutput2 = "acdb";
assertEquals(expectedOutput2, solution.removeDuplicateLetters(input2));

// 额外测试用例
// 输入字符串为小写字母的重复字母
String input3 = "aaaabbbbcccc";
String expectedOutput3 = "abcd";
assertEquals(expectedOutput3, solution.removeDuplicateLetters(input3));

// 输入字符串为已经去重的字符串
String input4 = "abcdef";
String expectedOutput4 = "abcdef";
assertEquals(expectedOutput4, solution.removeDuplicateLetters(input4));

// 输入字符串包含相同字母且前后顺序不同
String input5 = "zxyabcdezyxwvutsrqponmlkjihgfedcba";
String expectedOutput5 = "abcdefghijklmnopqrstuvwxyz";
assertEquals(expectedOutput5, solution.removeDuplicateLetters(input5));

// 输入为空字符串
String input6 = "";
String expectedOutput6 = "";
assertEquals(expectedOutput6, solution.removeDuplicateLetters(input6));

// 输入字符串只有一个字符
String input7 = "a";
String expectedOutput7 = "a";
assertEquals(expectedOutput7, solution.removeDuplicateLetters(input7));
}
}
