package all;

public class ClonePair9584 {

    int method1(String code,int offset){
      for (int i=offset; i < code.length(); i++) {
        if (!Character.isWhitespace(code.charAt(i))) {
          return i;
        }
      }
      return -1;
    }

    int method2(String str,int pos){
      for (; pos < str.length(); pos++) {
        char c=str.charAt(pos);
        if (!(c == ' ' || c == '\t')) {
          return pos;
        }
      }
      return -1;
    }
}
