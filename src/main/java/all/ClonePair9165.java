package all;

import java.util.*;

public class ClonePair9165 {

    int method1(String string,String sub){
      if (string == null || string.length() == 0 || sub == null || sub.length() == 0)   return 0;
      int count=0;
      int index=0;
      while ((index=string.indexOf(sub,index)) != -1) {
        count++;
        index+=sub.length();
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
