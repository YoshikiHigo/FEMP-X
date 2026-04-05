package unverified;

public class ClonePair8809 {

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

    int method2(String s,int i){
      for (; i < s.length(); i++) {
        char ch=s.charAt(i);
        if (ch != ' ' && ch != '\t')     return i;
      }
      return -1;
    }
}
