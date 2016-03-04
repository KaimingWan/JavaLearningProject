import java.util.HashMap;


/**
 * Created by Kami Wan on 2015/12/10.
 */


public class LearnHashCode {
    public static void main(String[] args) {

        HashMap<String, Integer> stuMap = new HashMap<String, Integer>();        //新建一个hashMap对象保存学生对象
        stuMap.put("Kami", 25);

        System.out.println(stuMap.get(new String("Kami")));         //用String对象不会出错是因为有常量池，地址是一样的

        System.out.println(stuMap.get(new StringBuffer("Kami")));   //重新new一个相同内容的StringBuffer对象后由于hashCode不一样了，就找不到啦


    }
}
