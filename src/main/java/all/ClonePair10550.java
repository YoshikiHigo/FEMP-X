package all;

public class ClonePair10550 {

    int method1(String str,int pos){
      for (; pos < str.length(); pos++) {
        char c=str.charAt(pos);
        if (!(c == ' ' || c == '\t')) {
          return pos;
        }
      }
      return -1;
    }

    int method2(String str,int fromIndex){
      for (int i=fromIndex; i < str.length(); i++) {
        char ch=str.charAt(i);
        if (!Character.isSpace(ch))     return i;
      }
      return -1;
    }
}
