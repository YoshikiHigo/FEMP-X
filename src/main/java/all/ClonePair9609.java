package all;

public class ClonePair9609 {

    int method1(String code,int offset){
      for (int i=offset; i < code.length(); i++) {
        if (!Character.isWhitespace(code.charAt(i))) {
          return i;
        }
      }
      return -1;
    }

    int method2(String s,int i){
      for (; i < s.length(); i++) {
        char ch=s.charAt(i);
        if (ch != ' ' && ch != '\t')     return i;
      }
      return -1;
    }
}
