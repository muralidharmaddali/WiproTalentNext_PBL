import java.io.*;
import  java.util.*;

class UserMainCode
  {
    public int lastDigitOf(int input1)
    {
                  if(input1<1)
                  {
                      return input1*(-1)%10;
                  }
                  return input1%10;
     }
  }
