package all;

import java.util.Arrays;

public class ClonePair11839 {

    String method1(String string,int width){
      if (string.length() > width) {
        string=string.substring(0,width);
      }
     else   if (string.length() < width) {
        char[] fill=new char[width - string.length()];
        Arrays.fill(fill,' ');
        string+=new String(fill);
      }
      return string;
    }

    String method2(String s,int w){
      int n=s.length();
      if (w < n)   return s.substring(0,w);
      StringBuilder result=new StringBuilder(s);
      for (int i=n; i < w; i++) {
        result.append(' ');
      }
      return result.toString();
    }
}
