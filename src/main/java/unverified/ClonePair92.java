package unverified;

public class ClonePair92 {

    boolean method1(char[] ch,int ofs,int len){
      int max;
      max=ofs + len;
      for (int i=ofs; i < max; i++) {
        if (!Character.isWhitespace(ch[i])) {
          return false;
        }
      }
      return true;
    }

    boolean method2(char[] ch,int start,int len){
      int end=start + len;
      for (int i=start; i < end; i++) {
        char c=ch[i];
        if (c != ' ' && c != '\t' && c != '\n' && c != '\r')     return false;
      }
      return true;
    }
}
