package unverified;

public class ClonePair3658 {

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

    String method2(String s,int n,char c,boolean paddingLeft){
      StringBuffer str=new StringBuffer(s);
      int strLength=str.length();
      if (n > 0 && n > strLength) {
        for (int i=0; i <= n; i++) {
          if (paddingLeft) {
            if (i < n - strLength)         str.insert(0,c);
          }
     else {
            if (i > strLength)         str.append(c);
          }
        }
      }
      return str.toString();
    }
}
