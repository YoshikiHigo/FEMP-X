package all;

public class ClonePair11455 {

    boolean method1(char c){
    switch (c) {
    case '<':case '>':case '(':case ')':case '[':case ']':case '{':case '}':    return false;
    }
    return true;
    }

    boolean method2(char ch){
      boolean result;
      if (Character.isLetterOrDigit(ch)) {
        result=true;
      }
     else   if (ch == '-') {
        result=true;
      }
     else   if (ch == '*') {
        result=true;
      }
     else {
        result=false;
      }
      return result;
    }
}
