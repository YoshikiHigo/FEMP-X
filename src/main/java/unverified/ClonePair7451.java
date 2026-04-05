package unverified;

import java.util.*;

public class ClonePair7451 {

    String method1(String s,int length,char c){
      if (length <= s.length()) {
        return s;
      }
      char[] pad=new char[length - s.length()];
      Arrays.fill(pad,c);
      return new String(pad) + s;
    }

    String method2(String sStr,int num,char pad){
      int i, iLen;
      iLen=sStr.length();
      if (iLen < num) {
        for (i=1; i <= num - iLen; i++)     sStr=pad + sStr;
      }
      return sStr;
    }
}
