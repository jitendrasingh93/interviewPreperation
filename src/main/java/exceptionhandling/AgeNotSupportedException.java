package exceptionhandling;

/**
 * Created by JitendraSingh on 16/10/17.
 */
public class AgeNotSupportedException extends Exception {

    AgeNotSupportedException(String message){
        super(message);
    }
}
