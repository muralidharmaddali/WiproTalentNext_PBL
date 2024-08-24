import java.io.*;
import java.util.*;
// Read only region start
class UserMainCode
{
public int uniqueDigitsCount(int input1){
// Read only region end
TreeSet<Integer> tset = new TreeSet<Integer>();
while(input1!=0)
{
tset.add(input1%10);
input1/=10;
}
return tset.size();
}
}
