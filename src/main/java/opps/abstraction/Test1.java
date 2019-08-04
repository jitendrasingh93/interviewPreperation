package opps.abstraction;

/**
 * Created by JitendraSingh on 20/05/18.
 */
public abstract class Test1 {

        public void add() {
            int a =8;
            System.out.println(a);

        }
         abstract void sub();
    }

    class Test22 extends Test1 {
        void sub() {
            System.out.println("Abstract");
        }
        public static void main(String str[]) {
            try{
                int a=2,b=0,c;
                Test22 t = new Test22();
                t.add();
                t.sub();
                c=a/b;
                System.out.println(c);
                System.exit(0);

            } catch(Exception e){
                System.out.println(e);
                System.exit(0);

            } finally {
                System.out.println("finally");
            }
        }
    }


