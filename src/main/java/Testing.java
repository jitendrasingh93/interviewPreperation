/**
 * Created by JitendraSingh on 15/10/17.
 */
public class Testing {
    public static void main(String str[]) throws NullPointerException
    {int a=0;
        int[] b = new int[5]; // combining both statements in one
        try{

            a=a/0;
            try{
                System.out.print(b[6]);
                try{
                    //some code with exception
                    try{
                        try{
//some code with no exception

                        }catch(Exception e5)
                        {System.out.println("Exception5==>"+e5);}


                    }catch(Exception e4)
                    {System.out.println("Exception4==>"+e4);}


                }catch(Exception e3)
                {System.out.println("Exception==3>"+e3);}


            }catch(Exception e2)
            {System.out.println("Exception2==>"+e2);}


        }catch(Exception e1)
        {System.out.println("Exception1==>"+e1);}

    }
}
