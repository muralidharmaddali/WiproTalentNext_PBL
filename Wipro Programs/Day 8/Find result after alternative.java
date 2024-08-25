using System;
using System.Collections.Generic;
//Read only region start
public class UserMainCode
{
public int AddSub(int input1,int input2)
{
//Read only region end
//Write code here
int globe=0;
if(input2==1){
for(int i=0;i<=input1;i++){
if(i%2==0){
globe=globe+(input1-i);
}
else globe=globe-(input1-i);
}
}
else{
for(int i=0;i<=input1;i++){
if(i%2==0 && i!=0){
globe=globe-(input1-i);
}
else globe=globe+(input1-i);
}
}
return globe;