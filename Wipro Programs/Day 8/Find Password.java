import java.io.*;
import java.util.*;
// Read only region start
class UserMainCode
{
public int findPassword(int input1,int input2,int input3,int input4,int input5){
// Read only region end
// Write code here...
int[] h1=new int[10];
int[] h2=new int[10];
int[] h3=new int[10];
int[] h4=new int[10];
int[] h5=new int[10];
int t1=input1,t2=input2,t3=input3,t4=input4,t5=input5;
int stable_sum=0,unstable_sum=0,i;
while(input1>0)
{
h1[input1%10]++;
input1/=10;
}
while(input2>0)

{
h2[input2%10]++;
input2/=10;
}
while(input3>0)
{
h3[input3%10]++;
input3/=10;
}
while(input4>0)
{
h4[input4%10]++;
input4/=10;
}
while(input5>0)
{
h5[input5%10]++;
input5/=10;
}

int c=0;
for(i=0;i<10;i++)
{
if(h1[i]!=0)

{
c=h1[i];
break;
}
}

for(i=0;i<10;i++)
{
if(h1[i]!=0)
{
if(c!=h1[i])
{
unstable_sum+=t1;
break;
}
}
}

if(i==10)
stable_sum+=t1;
for(i=0;i<10;i++)
{
if(h2[i]!=0)
{
c=h2[i];
break;
}

}
for(i=0;i<10;i++)
{
if(h2[i]!=0)
{
if(c!=h2[i])
{
unstable_sum+=t2;
break;
}
}
}
if(i==10)
stable_sum+=t2;
for(i=0;i<10;i++)
{
if(h3[i]!=0)
{
c=h3[i];
break;
}
}
for(i=0;i<10;i++)
{
if(h3[i]!=0)
{
if(c!=h3[i])

{
unstable_sum+=t3;
break;
}
}
}
if(i==10)
stable_sum+=t3;
for(i=0;i<10;i++)
{
if(h4[i]!=0)
{
c=h4[i];
break;
}
}
for(i=0;i<10;i++)
{
if(h4[i]!=0)
{
if(c!=h4[i])
{
unstable_sum+=t4;
break;
}
}

}
if(i==10)
stable_sum+=t4;
for(i=0;i<10;i++)
{
if(h5[i]!=0)
{
c=h5[i];
break;
}
}
for(i=0;i<10;i++)
{
if(h5[i]!=0)
{
if(c!=h5[i])
{
unstable_sum+=t5;
break;
}
}
}
if(i==10)
stable_sum+=t5;
return stable_sum-unstable_sum;

}
}