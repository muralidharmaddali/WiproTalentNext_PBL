import java.io.*;
import java.util.*;
// Read only region start
class UserMainCode
{
public int EvenDigitsSum(int input1){
    int sum=0, a; 
    while(input1!=0) 
    { 
        a=input1%10; 
        if(a%2==0) 
        { 
            sum+=a; 
            } 
            input1=input1/10; 
            } 
            return sum;
}
}