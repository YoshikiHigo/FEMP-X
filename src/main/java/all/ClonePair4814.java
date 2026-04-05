package all;

import java.util.Arrays;

public class ClonePair4814 {

    String method1(String s,char c,int length){
      if (s == null)   return (s);
      if (s.length() >= length)   return (s);
      StringBuilder sb=new StringBuilder();
      for (length=length - s.length(); length > 0; length--)   sb.append(c);
      sb.append(s);
      return (sb.toString());
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
