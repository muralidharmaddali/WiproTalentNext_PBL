import java.io.*;
import java.util.*;
// Read only region start
class UserMainCode
{
public int weightOfString(String input1,int input2){
// Read only region end
int sum=0; 
input1=input1.toUpperCase(); 
if(input2==0) 
{ 
    input1=input1.replaceAll("[AEIOU]",""); 
    } 
    int len=input1.length(); 
    for(int i=0;i<len;i++)
{ 
    char ch=input1.charAt(i); 
    if(Character.isAlphabetic(ch)) 
    { 
        sum+=ch-64; 
        } 
        } 
        return sum;
}
}