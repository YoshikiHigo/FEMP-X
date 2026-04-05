package unverified;

public class ClonePair7955 {

    String method1(String str,String pad,int length){
      if (str.length() >= length) {
        return str;
      }
      StringBuffer buf=new StringBuffer(str);
      for (int i=str.length(); i < length; i+=pad.length()) {
        buf.append(pad);
      }
      return buf.toString();
    }

    String method2(String original,String s,int minLen){
      if (original.length() >= minLen) {
        return original;
      }
      final StringBuffer result=new StringBuffer(original);
      while (result.length() < minLen) {
        result.insert(0,s);
      }
      return result.toString();
    }
}
