package all;

import java.util.*;

public class ClonePair9690 {

    String method1(String str,int width,boolean rightJustified){
      int len=str.length();
      int space=width - len;
      if (space <= 0) {
        return str;
      }
      StringBuffer buf=new StringBuffer();
      if (!rightJustified) {
        buf.append(str);
      }
      for (int i=0; i < space; i++) {
        buf.append(' ');
      }
      if (rightJustified) {
        buf.append(str);
      }
      return buf.toString();
    }

    String method2(String message,int width,boolean leftJustify){
      final int length=message.length();
      if (length < width) {
        final char[] tempArr=new char[width];
        if (leftJustify) {
          message.getChars(0,length,tempArr,0);
          Arrays.fill(tempArr,length,width,' ');
        }
     else {
          message.getChars(0,length,tempArr,width - length);
          Arrays.fill(tempArr,0,length,' ');
        }
        return new String(tempArr);
      }
      return message;
    }
}
