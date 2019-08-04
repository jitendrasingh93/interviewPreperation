/**
 * Created by JitendraSingh on 30/10/17.
 */
class Test {

        int value = 0;
        Test(){
            addValue();
        }
         void addValue(){
            value += 10;
        }
        int getValue(){
            return value;
        }
    }
    class Derived extends Test{
        Derived(){
            addValue();
        }
        void addValue(){
            value +=  20;
        }
    }
    public class Base{
        public static void main(String[] args){
            Test b = new Derived();
            System.out.println(b.getValue());
        }
}
