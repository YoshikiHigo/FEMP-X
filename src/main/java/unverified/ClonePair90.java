package unverified;

public class ClonePair90 {

    boolean method1(char[] ch,int start,int length){
      for (int i=start; i < start + length; i++) {
        char c=ch[i];
        if (c != '\n' && c != '\t' && c != ' ')     return false;
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
