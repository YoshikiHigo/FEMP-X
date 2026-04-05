package all;

public class ClonePair10956 {

    int method1(char[] chars,int offset,int length){
      int utflen=0;
      for (int i=0; i < length; i++) {
        int c=chars[i + offset];
        if ((c >= 0x0001) && (c <= 0x007F)) {
          utflen++;
        }
     else     if (c > 0x07FF) {
          utflen+=3;
        }
     else {
          utflen+=2;
        }
      }
      return utflen;
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
