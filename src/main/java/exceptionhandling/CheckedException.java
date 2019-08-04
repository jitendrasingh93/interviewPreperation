package exceptionhandling;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by JitendraSingh on 16/10/17.
 */
public class CheckedException {

    void show() throws Exception {
        System.out.println("parent no exception");
    }

    String display(){
        return "G";
    }
}

class ChildCheckedException extends CheckedException {



    @Override
    void show() throws Exception{
        System.out.println("parent no exception");
        validateIpAddress("10.10.10.19:9093");
    }

    boolean validateIpAddress(String address) throws Exception{
        boolean valid = false;
        if(address.contains(":")){
            valid = true;
        }else{
            throw new Exception("Ip address is incorrect");
        }
        return valid;
    }

}