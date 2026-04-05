package all;

public class ClonePair8177 {

    int method1(String text,int start,int end){
      char c;
      int value=0;
      for (int i=start; i < end; i++) {
        c=text.charAt(i);
        if (c >= '0' && c <= '9') {
          value=value * 10 + c - '0';
        }
     else {
          return -1;
        }
      }
      return value;
    }

    int method2(String data,int init,int end){
      int result=0;
      for (int i=init; i < end; i++) {
        final char c=data.charAt(i);
        if (!Character.isDigit(c))     return -1;
        result=10 * result + (c - '0');
      }
      return result;
    }
}
