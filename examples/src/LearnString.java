/**
 * Created by Kami Wan on 2015/12/13.
 */
public class LearnString {

    public static void main(String[] args) {
        String s = new String("1");
        String s2 = "1";
        s.intern();
        System.out.println(s == s2);            //理由同上        String s = new String("1");

        Long a = 120L;
        Long b = 120L;
        int c = 120;
        System.out.println(b == a);
        System.out.println(b == c);

        int i = 300;
        int j = 300;
        System.out.println(i == j);
    }

}

