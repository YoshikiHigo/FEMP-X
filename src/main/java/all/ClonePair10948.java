package all;

import java.util.StringTokenizer;

public class ClonePair10948 {

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

    int method2(String source,String find){
      if (source == null || source.length() == 0 || find == null || find.length() == 0) {
        return 0;
      }
      int count=0;
      int pos=source.indexOf(find,0);
      while (pos != -1) {
        ++count;
        pos=source.indexOf(find,pos + 1);
      }
      return count;
    }
}
