import java.util.*;
public class UserMainCode
{
public string secondWordUpperCase(string input1)
{
String stra[]; 
stra=input1.split(" "); 
if(stra.length<=1) 
{ 
    return "LESS"; 
    } 
    else {
String a=stra[1]; 
a=a.toUpperCase(); 
return a; 
} 
}
}