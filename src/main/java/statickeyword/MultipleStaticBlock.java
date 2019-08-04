package statickeyword;

/**
 * Created by JitendraSingh on 10/05/18.
 */
public class MultipleStaticBlock {

    static int val;


    static {
        val = 10;
        System.out.println("bloack 1 : "+val);
    }

    static {
        val = 20;
        System.out.println("balock 2 : "+val);
    }

    static {
        val = 30;
        System.out.println("bloack 3 : "+val);
    }

    public static void main(String[] args) {
        MultipleStaticBlock mutliplatStaticBlock = new MultipleStaticBlock();
        val = 40;
        System.out.println("con :" +val);
    }

}
