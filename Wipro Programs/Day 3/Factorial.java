import java.io.*;
import  java.util.*;

Class UserMainCode
{
    public int nFactorial(int input1)
    {
         int sum=1,i=1;
            while(i<=input1)
            {
                sum = sum *i;
                i++;
            }
            return sum;
    }
}