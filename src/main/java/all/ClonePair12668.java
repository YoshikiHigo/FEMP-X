package all;

import java.util.StringTokenizer;

public class ClonePair12668 {

    int method1(String string){
      int sex;
      if (string.equals("")) {
        sex=0;
      }
     else {
        sex=Integer.parseInt(string);
      }
      return sex;
    }

    int method2(String s){
      StringTokenizer t=new StringTokenizer(s,":");
      int duration=0;
      while (t.hasMoreTokens()) {
        int n=Integer.parseInt(t.nextToken());
        duration=duration * 60 + n;
      }
      return duration;
    }
}
