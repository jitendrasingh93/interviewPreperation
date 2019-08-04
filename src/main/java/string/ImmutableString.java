package string;

/**
 * Created by JitendraSingh on 29/09/17.
 */
public class ImmutableString {

    /*
    * String is Immutable
    * */
    public static void main(String[] args) {
        String str="abc";
        System.out.println(str.concat("cd")); //abcd
        System.out.println(str); //ab
        String s2 = new String("abc");
        System.out.println(str.equals(s2));

    }


    void stringType () {

        String s1 = "abc";
        //No string with “abc” is there in pool, so JVM will create string in string pool and s1 will be a reference variable which will refer to it.

        String s2 = new String("abc");
        //string is created using new operator, it will force JVM to create new string in heap (not in string pool).

        String s3 = "abc";
        //string with “abc” is there in pool, so s3 will be a reference variable which will refer to “abc” in string pool.

        String s4 = new String("abc");
        //string is created using new operator, it will force JVM to create new string in heap (not in string pool).

        String s5 = new String("abc").intern();
        //string is created using new operator but intern method has been invoked on it, so s5 will be a reference variable which will refer to “abc” in string pool.
    }


}
