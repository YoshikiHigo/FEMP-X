package unverified;

import java.util.*;

public class ClonePair6265 {

    boolean method1(String item,String part){
      int i0=part.indexOf('*');
      int i1=part.lastIndexOf('*');
      if ((i0 == -1) && (i1 == -1))   return item.equals(part);
     else   if (i0 == i1)   return item.startsWith(part.substring(0,i0)) && item.endsWith(part.substring(i0 + 1));
     else   if ((i0 == 0) && (i1 == (part.length() - 1)))   return item.contains(part.substring(i0 + 1,i1));
     else   return item.startsWith(part.substring(0,i0)) && item.endsWith(part.substring(i0 + 1)) && item.contains(part.substring(i0 + 1,i1));
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
