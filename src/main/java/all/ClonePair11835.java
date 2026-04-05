package all;

import java.util.Arrays;

public class ClonePair11835 {

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

    String method2(String text,int width){
      if (text.length() == width) {
        return text;
      }
     else   if (text.length() > width) {
        return text.substring(0,width);
      }
     else {
        StringBuffer padded=new StringBuffer(text);
        while (padded.length() < width) {
          padded.append(' ');
        }
        return padded.toString();
      }
    }
}
