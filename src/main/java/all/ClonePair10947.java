package all;

import java.util.StringTokenizer;

public class ClonePair10947 {

    int method1(String name1,String name2){
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

    int method2(String str,String sub){
      if (str == null || str.length() == 0 || sub == null || sub.length() == 0) {
        return 0;
      }
      int count=0;
      int idx=0;
      while ((idx=str.indexOf(sub,idx)) != -1) {
        count++;
        idx+=sub.length();
      }
      return count;
    }
}
