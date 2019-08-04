package java_generics;

/**
 * Created by JitendraSingh on 16/05/18.
 */
public class JavaGenericsClass<T> {

    private T obj;

    public T getObj() {
        return obj;
    }

    public void add(T obj) {
        this.obj = obj;
    }

    public static void main(String[] args) {
        JavaGenericsClass<Integer> integerJavaGenerics = new JavaGenericsClass<>();
        JavaGenericsClass<String> stringJavaGenerics = new JavaGenericsClass<>();
        integerJavaGenerics.add(new Integer(10));
        stringJavaGenerics.add(new String("Jeetu"));

        System.out.println("integer : "+integerJavaGenerics.getObj());
        System.out.println("string : "+stringJavaGenerics.getObj());
    }
}
