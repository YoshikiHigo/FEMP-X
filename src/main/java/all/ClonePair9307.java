package all;

public class ClonePair9307 {

    String method1(char[] data,int beginIndex,int endIndex){
      StringBuffer buf=new StringBuffer(data.length);
      for (int i=beginIndex; i < data.length && i < endIndex; i++) {
        char c=data[i];
        if (c < ' ' || c > 127)     c='.';
        buf.append(c);
      }
      return buf.toString();
    }

    String method2(char[] data,int beginIndex,int endIndex){
      final StringBuffer buf=new StringBuffer(data.length);
      for (int i=beginIndex; (i < data.length) && (i < endIndex); i++) {
        char c=data[i];
        if ((c < ' ') || (c > 127)) {
          c='.';
        }
        buf.append(c);
      }
      return buf.toString();
    }
}
