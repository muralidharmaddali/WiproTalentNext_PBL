import java.uti.*;
int isPalinNum(int input1)
{
// Read only region end
// Write code here
String str=String.valueOf(input1);
StringBuffer sb=new StringBuffer(str);
sb.reverse();
String str2=String.valueOf(sb);
if(str.equals(str2))
{
return 2;
}
else
{
return 1;
}
}