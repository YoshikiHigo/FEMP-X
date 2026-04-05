package all;

public class ClonePair10753 {

    int method1(String str,int startIndex){
      int i=startIndex;
      for (; i < str.length(); i++) {
        if (!Character.isWhitespace(str.charAt(i))) {
          break;
        }
      }
      return i;
    }

    int method2(String s,int pos){
      while (pos < s.length() && Character.isWhitespace(s.charAt(pos)))   pos++;
      return pos;
    }
}
