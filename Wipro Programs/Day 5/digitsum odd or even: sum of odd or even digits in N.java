import java.io.*;
import java.util.*;
// Read only region start
class UserMainCode
{
public int EvenOddDigitsSum(int input1,String input2){
// Read only region end
// Write code here...
int count1=0,count2=0, num; 
while(input1!=0) { 
    num=input1%10; 
    if(num%2!=0) 
    { 
        count1+=num; 
    } 
    else 
    { 
        count2+=num; 
    } 
    input1=input1/10; 
    } 
    if(input2.equals("even")) 
    { 
        return count2; 
        } 
        else 
        { 
            return count1; 
        }
}
}