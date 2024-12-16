import functions.*;
import functions.basic.*;
import functions.meta.Composition;

import java.io.*;

public class Main {
    public static void main(String[] args) throws InappropriateFunctionPointException, IOException {
        double[] arr= {0,1,2,3,4,5,6,7,8,9,10};
        double[] arr2= {10,9,8,7,6,5,4,3,2,1,0};
        TabulatedFunction tabF1 = new LinkedListTabulatedFunction(0, 10, arr);
        TabulatedFunction tabF2 = new ArrayTabulatedFunction(0, 10, arr);
        try
        {
            TabulatedFunction cloneTabF1=(TabulatedFunction) tabF1.clone();
            TabulatedFunction cloneTabF2=(TabulatedFunction) tabF2.clone();
//            cloneTabF1.deletePoint(4);
//            cloneTabF2.deletePoint(2);
            System.out.println(tabF1.toString()+"/n");
            System.out.println(tabF2.toString());
            System.out.println(cloneTabF1.toString()+"/n");
            System.out.println(cloneTabF2.toString()+"/n");

            System.out.println(tabF1.hashCode());
            System.out.println(tabF2.hashCode());
            System.out.println(cloneTabF1.hashCode());
            System.out.println(cloneTabF2.hashCode());

            System.out.println(cloneTabF1.equals(tabF1));
            System.out.println(cloneTabF2.equals(tabF2));

            System.out.println(cloneTabF1.getClass());
            System.out.println(tabF1.getClass());
            System.out.println(cloneTabF2.getClass());
            System.out.println(tabF2.getClass());
        }
        catch(CloneNotSupportedException e)
        {
            e.getMessage();
        }
    }
}