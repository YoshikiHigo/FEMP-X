package unverified;

public class ClonePair3660 {

    String method1(String txt,int width,char padChar,boolean left){
      StringBuffer result=new StringBuffer();
      int txtLength=txt.length();
      if (txtLength >= width) {
        return txt;
      }
      int padLength=width - txtLength;
      for (int i=0; i < padLength; i++) {
        result.append(padChar);
      }
      if (left) {
        return result.toString() + txt;
      }
     else {
        return txt + result.toString();
      }
    }

    String method2(String str,int len,char ch,boolean left){
      StringBuffer buffer=null;
      int missing=len - str.length();
      if (missing <= 0)   return str;
      buffer=new StringBuffer(len);
      if (!left)   buffer.append(str);
      for (int i=1; i <= missing; i++)   buffer.append(ch);
      if (left)   buffer.append(str);
      return buffer.toString();
    }
}
