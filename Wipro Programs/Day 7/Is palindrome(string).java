import java.io.*;
import java.util.*;
// Read only region start
class UserMainCode
{
public int isPalindrome(String input1){
    StringBuffer sb=new StringBuffer(input1); 
    sb.reverse(); 
    String str=String.valueOf(sb); 
    if(input1.equalsIgnoreCase(str)) 
    { 
        return 2; 
    } 
    else 
    { 
        return 1; 
        }
}
}