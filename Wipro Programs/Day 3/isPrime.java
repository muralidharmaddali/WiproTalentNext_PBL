import java.util.*;
import java.io.*;
class UserMainCode{
public int isPrime(int input1)
{
    int i,cnt=0;
            for(i=1;i*i<input1;i++)
            {
                if(input1%i==0)
                {
                    cnt++;
                    if(input1/i!=i)
                    {
                        cnt++;
                    }
                }
            }
            if(cnt==2) return 2;
            return 1;
    }
}