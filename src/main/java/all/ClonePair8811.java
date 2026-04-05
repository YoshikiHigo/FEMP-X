package all;

public class ClonePair8811 {

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

    int method2(String str,int fromIndex){
      for (int i=fromIndex; i < str.length(); i++) {
        char ch=str.charAt(i);
        if (!Character.isSpace(ch))     return i;
      }
      return -1;
    }
}
