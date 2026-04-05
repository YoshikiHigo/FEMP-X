package all;

import java.util.Arrays;

public class ClonePair11845 {

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

    String method2(String s,int n){
      int l=s.length();
      if (l == n)   return s;
     else   if (l > n)   return s.substring(0,n);
     else {
        char[] carr=new char[n];
        s.getChars(0,l,carr,0);
        while (l < n)     carr[l++]=' ';
        return new String(carr);
      }
    }
}
