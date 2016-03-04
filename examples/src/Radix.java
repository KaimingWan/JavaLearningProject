/**
 * Created by Kami Wan on 2015/12/17.
 */
public class Radix {
    public static void main(String[] args) {
        /*
            将其他进制表示的字符串转化成十进制内容
         */
        System.out.println(Integer.valueOf("10", 16));       //16进制的10代表的是十进制当中的16，返回int
        System.out.println(Integer.parseInt("A", 16));       //16进制的A代表的是十进制当中的10,返回Integer
        System.out.println(Long.parseLong("B", 16));         //16进制的B代表的是十进制当中的11,返回Long
        /*
            将十进制表示的内容转化成二进制的字符串
         */
        System.out.println(Integer.toBinaryString(16));     //结果为10000，二进制表示的16，返回值是String
    }
}
