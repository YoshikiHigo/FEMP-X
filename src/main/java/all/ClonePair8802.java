package all;

public class ClonePair8802 {

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

    int method2(String code,int offset){
      for (int i=offset; i < code.length(); i++) {
        if (!Character.isWhitespace(code.charAt(i))) {
          return i;
        }
      }
      return -1;
    }
}
