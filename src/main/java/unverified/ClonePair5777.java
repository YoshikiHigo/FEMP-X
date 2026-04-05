package unverified;

import java.util.*;

public class ClonePair5777 {

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
