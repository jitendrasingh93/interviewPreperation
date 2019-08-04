package bodmas.rules;

import java.util.*;

/**
 * Created by JitendraSingh on 13/08/18.
 */
public class BodmasRules {

        /*public static void main(String[] args)
        {
            Scanner scan = new Scanner(System.in);
        *//* Create stacks for operators and operands *//*
            Stack<Integer> op  = new Stack<Integer>();
            Stack<Double> val = new Stack<Double>();
        *//* Create temporary stacks for operators and operands *//*
            Stack<Integer> optmp  = new Stack<Integer>();
            Stack<Double> valtmp = new Stack<Double>();
        *//* Accept expression *//*
            System.out.println("Evaluation Of Arithmetic Expression Using Stacks Test\n");
            System.out.println("Enter expression\n");
            String input = scan.next();
            input = "0" + input;
            input = input.replaceAll("-","+-");

        *//* Store operands and operators in respective stacks *//*
            String temp = "";
            for (int i = 0;i < input.length();i++)
            {
                char ch = input.charAt(i);
                if (ch == '-')
                    temp = "-" + temp;
                else if (ch != '+' &&  ch != '*' && ch != '/')
                    temp = temp + ch;
                else
                {
                    val.push(Double.parseDouble(temp));
                    op.push((int)ch);
                    temp = "";
                }
            }
            val.push(Double.parseDouble(temp));
        *//* Create char array of operators as per precedence *//*
        *//* -ve sign is already taken care of while storing *//*
            char operators[] = {'/','*','+'};
        *//* Evaluation of expression *//*
            for (int i = 0; i < 3; i++)
            {
                boolean it = false;
                while (!op.isEmpty())
                {
                    int optr = op.pop();
                    double v1 = val.pop();
                    double v2 = val.pop();
                    if (optr == operators[i])
                    {
                    *//* if operator matches evaluate and store in temporary stack *//*
                        if (i == 0)
                        {
                            valtmp.push(v2 / v1);
                            it = true;
                            break;
                        }
                        else if (i == 1)
                        {
                            valtmp.push(v2 * v1);
                            it = true;
                            break;
                        }
                        else if (i == 2)
                        {
                            valtmp.push(v2 + v1);
                            it = true;
                            break;
                        }
                    }
                    else
                    {
                        valtmp.push(v1);
                        val.push(v2);
                        optmp.push(optr);
                    }
                }
            *//* Push back all elements from temporary stacks to main stacks *//*
                while (!valtmp.isEmpty())
                    val.push(valtmp.pop());
                while (!optmp.isEmpty())
                    op.push(optmp.pop());
            *//* Iterate again for same operator *//*
                if (it)
                    i--;
            }
            System.out.println("\nResult = "+val.pop());
        }*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String orgString = sc.next();
       // String orgString = "(3+4)*(7/2)";
        System.out.println(findValueInBraces(orgString));

    }

    public static String findValueInBraces(String finalStr) {

        while (finalStr.contains("(") && finalStr.contains(")")) {
            int fIndex = finalStr.indexOf("(");
            int nIndex = finalStr.indexOf(")");
            String subString = finalStr.substring(fIndex + 1, nIndex);
            finalStr = finalStr.substring(0, fIndex)
                    + calculate(subString)
                    + finalStr.substring(nIndex + 1,
                    finalStr.length());
        }
        return calculate(finalStr);

    }

    public static String calculate(String finalString) {

        while (finalString.contains("(") && finalString.contains(")")) {
            findValueInBraces(finalString);
        }
        while (!isNum(finalString)) {
            List<Integer> positions = getOperandPosition(finalString);
            int pos = positions.get(0);
            if (positions.size() >= 2 && positions.get(1) != null) {
                int nxtPos = positions.get(1);
                finalString = getValue(finalString.substring(0, nxtPos), pos)
                        + finalString.substring(nxtPos, finalString.length());
            } else {
                finalString = getValue(
                        finalString.substring(0, finalString.length()), pos);
            }
        }
        return finalString;

    }

    public static boolean isNum(String str) {
        if (str.contains("+") || str.contains("-") || str.contains("*")
                || str.contains("/")) {
            return false;
        }
        return true;
    }

    public static List<Integer> getOperandPosition(String str) {

        List<Integer> integers = new ArrayList<>();

        if (str.contains("+")) {
            integers.add(str.indexOf("+"));
        }

        if (str.contains("-")) {
            integers.add(str.indexOf("-"));
        }

        if (str.contains("*")) {
            integers.add(str.indexOf("*"));
        }

        if (str.contains("/")) {
            integers.add(str.indexOf("/"));
        }

        Collections.sort(integers);
        return integers;
    }

    public static String getValue(String str, int pos) {
        double finalVal = 0;
        double a = Double.parseDouble(str.substring(0, pos));
        double b = Double.parseDouble(str.substring(pos + 1, str.length()));
        char c = str.charAt(pos);

        if (c == '*') {
            finalVal = a * b;
        } else if (c == '/') {
            finalVal = a / b;
        } else if (c == '+') {
            finalVal = a + b;
        } else if (c == '-') {
            finalVal = a - b;
        }
        return String.valueOf(finalVal);
    }
}