package all;

import java.util.*;

public class ClonePair6262 {

    String method1(int value,int line_length,int total_length){
      StringBuffer buff=new StringBuffer();
      for (int i=0; i < total_length; i+=line_length) {
        for (int j=0; j < line_length && i + j < total_length; j++) {
          buff.append(value + " ");
        }
        buff.append("\n");
      }
      return buff.toString();
    }

    String method2(int cars,int nums,int esps){
      StringBuffer sb=new StringBuffer("");
      int c=0, n=0, e=0, tmp;
      Random r=new Random(Calendar.getInstance().getTimeInMillis());
      char ch;
      while (true) {
        tmp=r.nextInt(126);
        if (tmp < 33) {
          continue;
        }
        ch=(char)tmp;
        if (Character.isWhitespace(ch)) {
          continue;
        }
     else     if (Character.isDigit(ch) && n < nums) {
          n++;
          sb.append(ch);
        }
     else     if (Character.isLetter(ch) && c < cars) {
          c++;
          sb.append(ch);
        }
     else     if (e < esps) {
          e++;
          sb.append(ch);
        }
        if (c == cars && n == nums && e == esps) {
          break;
        }
      }
      return sb.toString();
    }
}
