package all;

public class ClonePair7859 {

    int method1(char[] chars,int from,int to,char value){
      for (int i=from; i < to; i++) {
        if (chars[i] == value)     return i;
      }
      return -1;
    }

    int method2(char[] buf,int offset,int len,char c){
      int i=offset - 1;
      int lim=offset + len;
      while (++i < lim) {
        if (buf[i] == c) {
          return i;
        }
      }
      return -1;
    }
}
