import java.io.*;
import  java.util.*;

class UserMainCode{
    public int isMultiple(int input1,int input2){
        if(input1==0 || input2==0)
        {
            return 3;
        }
        if(input1<0 || input1>0)
        {
            if(input1%input2==0)
            {
                return 2; 
            }
        }
        return 1;
 }
}

