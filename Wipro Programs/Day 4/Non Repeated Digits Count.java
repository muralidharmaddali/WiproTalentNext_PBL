import java.io.*;
import java.util.*;
// Read only region start
class UserMainCode
{
public int nonRepeatDigitsCount(int input1){
// Read only region end
int ct=0,r,i;
int h[]=new int[10];
while(input1>0){
r=input1%10;
h[r]++;
input1=input1/10;
}
for(i=0;i<10;i++){
if(h[i]==1){
ct++;
}
}
return ct;
}
}