package unverified;

import java.util.Arrays;

public class ClonePair11843 {

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

    String method2(String printThis,int width){
      String out="";
      if (printThis.length() > width) {
        out+=printThis.substring(0,width);
      }
     else {
        out+=printThis;
        String pad="";
        for (int i=width - printThis.length(); i > 0; i--) {
          pad+=" ";
        }
        out+=pad;
      }
      return out;
    }
}
