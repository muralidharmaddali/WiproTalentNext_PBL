import java.io.*;
import java.util.*;
// Read only region start

class UserMainCode
{
public int digitSum(int input1){
// Read only region endint flag=0;
if(input1==0) 
{ 
    return 0; 
    } 
if(input1<0) 
{ 
    flag=1; 
    input1=Math.abs(input1); 
    } 
    input1=input1%9; 
    input1=(input1==0)?9:input1; 
    return (flag==1)?-input1:input1
}
}