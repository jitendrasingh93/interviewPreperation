package exceptionhandling;

/**
 * Created by JitendraSingh on 16/10/17.
 * When class is final, it cannot be inheritable
 */
public final class ThrowValidate {

    private final int value  = 10;

    final void validate(int age) throws Exception {

        if (age >20) {
            System.out.println("yes");
        } else {
            System.out.println("no");
            throw new AgeNotSupportedException("exception occur");
        }
    }

    public static void main(String[] args) {

        ThrowValidate s = new ThrowValidate();
        try {
            s.validate(10);
        } catch (Exception e) {
            //System.out.println("As age is less than 20, Hence exception is handled for this");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("finally block always execute");
        }

        System.out.println("Normal flow is resumed");
    }
}
