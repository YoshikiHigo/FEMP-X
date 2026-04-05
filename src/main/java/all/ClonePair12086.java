package all;

public class ClonePair12086 {

    boolean method1(char c){
      if (c <= 32)   return false;
    switch (c) {
    case 127:case '(':case ')':case '<':case '>':case '@':case ',':case ';':case ':':case '\\':case '"':case '/':case '[':case ']':case '?':case '=':case '{':case '}':    return false;
    default:  return true;
    }
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
