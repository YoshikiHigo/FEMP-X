package unverified;

import java.util.*;

public class ClonePair7452 {

    String method1(String s,int length,char c){
      if (length <= s.length()) {
        return s;
      }
      char[] pad=new char[length - s.length()];
      Arrays.fill(pad,c);
      return new String(pad) + s;
    }

    String method2(String s,int length,char c){
      int needed=length - s.length();
      if (needed <= 0) {
        return s;
      }
      char[] padding=new char[needed];
      java.util.Arrays.fill(padding,c);
      StringBuffer sb=new StringBuffer(length);
      sb.append(padding);
      sb.append(s);
      return sb.toString();
    }
}
