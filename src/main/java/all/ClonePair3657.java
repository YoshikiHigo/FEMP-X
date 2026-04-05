package all;

public class ClonePair3657 {

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

    String method2(String s,int length,char c,boolean leading){
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
}
