package all;

public class ClonePair8805 {

    int method1(String json,int startFrom){
      int length=json.length();
      for (int i=startFrom; i < length; i++) {
        char curChar=json.charAt(i);
        if (Character.isWhitespace(curChar)) {
          continue;
        }
        return i;
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
