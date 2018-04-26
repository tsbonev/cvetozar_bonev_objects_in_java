package com.clouway.crm.core.Sumator;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.ParseException;

public class SumatorExceptions {


    public String sum(String a, String b)
             throws NumberFormatException {

        boolean success = false;
        String res = "";

        try {
            int A = Integer.parseInt(a);
            int B = Integer.parseInt(b);
            res = Integer.toString(A + B);
            success = true;
            return res;
        }
        catch (NumberFormatException e){
            System.out.println("Caught exception: " + e);
            /*
            StackTraceElement elements[] = e.getStackTrace();
            for (int i = 0, n = elements.length; i < n; i++){
                System.err.println(elements[i].getFileName()
                + ":" + elements[i].getLineNumber()
                + ">> "
                + elements[i].getMethodName() + "()");
            }
            */
        }
        finally {

            if(success){
                return res;
            }
            return "Summation failed";
        }

    }


}
