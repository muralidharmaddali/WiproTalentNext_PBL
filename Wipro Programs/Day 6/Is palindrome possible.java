import java.util.*;

int isPalinNumPossible(int input1)
{
   int arr[]= new int[10]; 
   int count=0; while(input1!=0) 
   { 
    arr[input1%10]++; 
    input1/=10; 
    } 
    for(int i=0;i<10;i++) 
    { 
        if(arr[i]%2!=0) 
        { 
            if(count!=0) 
            { 
                return 1; 
            } 
             count++; 
        } 
    }
 return 2;
}