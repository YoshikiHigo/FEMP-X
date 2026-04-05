package unverified;

public class ClonePair91 {

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

    boolean method2(char[] pChars,int pOffset,int pLen){
      for (int i=0; i < pLen; i++) {
        if (!Character.isWhitespace(pChars[pOffset + i])) {
          return false;
        }
      }
      return true;
    }
}
