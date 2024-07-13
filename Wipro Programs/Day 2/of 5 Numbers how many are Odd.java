import java.io.*;
import  java.util.*;

class UserMainCode{

public int countOdds(int input1,int input2,int input3,int input4,int input5){
    int a[] = {input1,input2,input3,input4,input5};
        int i,cnt=0;
        for(i=0;i<a.length;i++)
        {
            if(a[i]%2!=0)
            {
                cnt++;
            }
        }
        return cnt;
}

}