package all;

import java.util.*;

public class ClonePair5776 {

    boolean method1(String specific,String generic){
      StringTokenizer specificTokenizer=new StringTokenizer(specific,"/");
      StringTokenizer genericTokenizer=new StringTokenizer(generic,"/");
      if (specificTokenizer.countTokens() != genericTokenizer.countTokens())   return false;
      while (specificTokenizer.hasMoreTokens()) {
        String specificToken=specificTokenizer.nextToken();
        String genericToken=genericTokenizer.nextToken();
        if ((genericToken.indexOf("*") == -1) && !genericToken.equals(specificToken))     return false;
      }
      return true;
    }

    boolean method2(String s1,String s2){
      StringTokenizer st1=new StringTokenizer(s1);
      StringTokenizer st2=new StringTokenizer(s2);
      while (st1.hasMoreTokens()) {
        if (!st2.hasMoreTokens())     return false;
        if (!st1.nextToken().equals(st2.nextToken()))     return false;
      }
      if (st2.hasMoreTokens())   return false;
      return true;
    }
}
