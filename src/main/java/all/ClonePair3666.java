package all;

public class ClonePair3666 {

    String method1(String s,int n,char c,boolean paddingLeft){
      StringBuffer str=new StringBuffer(s);
      int strLength=str.length();
      if (n > 0 && n > strLength) {
        for (int i=0; i <= n; i++) {
          if (paddingLeft) {
            if (i < n - strLength) {
              str.insert(0,c);
            }
          }
     else {
            if (i > strLength) {
              str.append(c);
            }
          }
        }
      }
      return str.toString();
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
