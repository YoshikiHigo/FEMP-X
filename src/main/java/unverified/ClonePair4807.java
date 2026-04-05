package unverified;

import java.util.Arrays;

public class ClonePair4807 {

    String method1(String value,char padding,int totalLength){
      if (value == null) {
        return value;
      }
      if (value.length() >= totalLength) {
        return value;
      }
      final StringBuffer sb=new StringBuffer(value);
      for (int i=0; i < totalLength - value.length(); i++) {
        sb.append(padding);
      }
      return sb.toString();
    }

    String method2(String original,char padChar,int width){
      if (original == null) {
        return original;
      }
      int padding=width - original.length();
      if (padding <= 0) {
        return original;
      }
      StringBuilder sb=new StringBuilder(original);
      char[] ch=new char[padding];
      Arrays.fill(ch,padChar);
      sb.insert(0,ch);
      return sb.toString();
    }
}
