package all;

public class ClonePair5128 {

    boolean method1(char[] buffer,int offset,char[] pattern){
      if (buffer.length < offset + pattern.length) {
        return false;
      }
      for (int i=0; i < pattern.length; i++) {
        if (buffer[offset + i] != pattern[i]) {
          return false;
        }
      }
      return true;
    }

    boolean method2(char[] cs,int offSet,char[] ps){
      for (int i=0; i < ps.length; i++) {
        int c=i + offSet;
        if (c >= cs.length) {
          return false;
        }
        if ((cs[c] != ps[i]) && (ps[i] != '?')) {
          return false;
        }
      }
      return true;
    }
}
