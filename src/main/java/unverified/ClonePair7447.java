package unverified;

import java.util.*;

public class ClonePair7447 {

    String method1(String s,int length,char c){
      if (length <= s.length()) {
        return s;
      }
      char[] pad=new char[length - s.length()];
      Arrays.fill(pad,c);
      return new String(pad) + s;
    }

    String method2(String s,int len,char c){
      int slen=s.length();
      if (slen >= len)   return s;
     else {
        char[] pad=new char[len - slen];
        for (int i=len - slen - 1; i >= 0; i--)     pad[i]=c;
        return s + new String(pad);
      }
    }
}
