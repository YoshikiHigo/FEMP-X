package all;

public class ClonePair10958 {

    int method1(char[] cs,int off,int len){
      int result=0;
      for (int i=0; i < len; ++i) {
        char c=cs[off + i];
        if ((c >= 0x0001) && (c <= 0x007F)) {
          ++result;
        }
     else {
          if (c > 0x07FF) {
            result+=3;
          }
     else {
            result+=2;
          }
        }
      }
      return result;
    }

    int method2(char[] chars,int offset,int length){
      int len=0;
      length+=offset;
      for (int i=offset; i < length; i++) {
        int c=chars[i];
        if ((c >= 0x0001) && (c <= 0x007F)) {
          len++;
        }
     else     if (c > 0x07FF) {
          len+=3;
        }
     else {
          len+=2;
        }
      }
      return len;
    }
}
