package unverified;

import java.util.*;

public class ClonePair9346 {

    int method1(String string,String other){
      if (null == string)   return 0;
      if (null == other)   return 0;
      if (0 >= string.length())   return 0;
      if (0 >= other.length())   return 0;
      int count=0;
      int index=0;
      while ((index <= string.length() - other.length()) && (-1 != (index=string.indexOf(other,index)))) {
        count++;
        index+=other.length();
      }
      return count;
    }

    int method2(String name1,String name2){
      StringTokenizer st1, st2;
      int k=0;
      if (name1 == null || name2 == null) {
        return 0;
      }
      st1=new StringTokenizer(name1,".");
      st2=new StringTokenizer(name2,".");
      while (st1.hasMoreTokens() && st2.hasMoreTokens()) {
        if (st1.nextToken().equalsIgnoreCase(st2.nextToken())) {
          k++;
        }
     else {
          break;
        }
      }
      return k;
    }
}
