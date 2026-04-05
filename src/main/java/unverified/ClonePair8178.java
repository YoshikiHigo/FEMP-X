package unverified;

import java.util.*;

public class ClonePair8178 {

    boolean method1(String s1,String s2){
      StringTokenizer st1=new StringTokenizer(s1);
      StringTokenizer st2=new StringTokenizer(s2);
      while (st1.hasMoreTokens()) {
        if (!st2.hasMoreTokens())     return false;
        if (!st1.nextToken().equals(st2.nextToken()))     return false;
      }
      if (st2.hasMoreTokens())   return false;
      return true;
    }

    boolean method2(String balise,String name){
      int length=balise.length();
      if (!balise.isEmpty() && balise.charAt(length - 1) == '*') {
        return name.startsWith(balise.substring(0,length - 1));
      }
     else {
        return name.equals(balise);
      }
    }
}
