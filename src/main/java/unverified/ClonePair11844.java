package unverified;

import java.util.Arrays;

public class ClonePair11844 {

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

    String method2(String s,int desiredLength){
      int len=s.length();
      if (len == desiredLength)   return s;
      if (len > desiredLength)   return s.substring(0,desiredLength);
      StringBuffer sb=new StringBuffer(s);
      for (int i=len; i < desiredLength; i++)   sb.append(' ');
      return sb.toString();
    }
}
