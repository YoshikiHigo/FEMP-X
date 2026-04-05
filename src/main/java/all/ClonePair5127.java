package all;

public class ClonePair5127 {

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

    boolean method2(char[] buffer,int pos,char[] tag){
      if (buffer.length - pos < tag.length)   return false;
      for (int i=0; i < tag.length; i++)   if (buffer[pos++] != tag[i])   return false;
      return true;
    }
}
