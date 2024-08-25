int MostFrequentDigit(int input1,int input2,int input3,int input4)
{
// Read only region end
// Write code here
int arr[]=new int[10]; 
int input[]={input1,input2,input3,input4}; 
for(int invali:input) 
{ 
    if(invali==0) 
    { 
        arr[0]++; 
    } 
    while(invali!=0) 
    { 
        int val=invali%10; 
        arr[val]++; 
        invali/=10; 
    } 
} 
            int max=0,ans=0; 
            for(int i=0;i<10;i++) 
            { 
                if(max<=arr[i]) 
                { max=arr[i]; 
                    ans=i; 
                } 
            } 

    return ans;
}