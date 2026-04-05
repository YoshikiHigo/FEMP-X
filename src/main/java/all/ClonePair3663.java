package all;

public class ClonePair3663 {

    String method1(String s,int length,char c,boolean leading){
      if (s.length() >= length) {
        return s;
      }
     else {
        StringBuffer buf=new StringBuffer(length);
        if (!leading) {
          buf.append(s);
        }
        for (int i=s.length(); i < length; ++i) {
          buf.append(c);
        }
        if (leading) {
          buf.append(s);
        }
        return buf.toString();
      }
    }

    String method2(String str,int len,char ch,boolean left){
      StringBuffer buffer=null;
      int missing=len - str.length();
      if (missing <= 0) {
        return str;
      }
      buffer=new StringBuffer(len);
      if (!left) {
        buffer.append(str);
      }
      for (int i=1; i <= missing; i++) {
        buffer.append(ch);
      }
      if (left) {
        buffer.append(str);
      }
      return buffer.toString();
    }
}
