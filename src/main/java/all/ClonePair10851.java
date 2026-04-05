package all;

public class ClonePair10851 {

    boolean method1(char pChar){
      if (pChar == '_') {
        return true;
      }
     else   if (pChar >= 'a' && pChar <= 'z') {
        return true;
      }
     else   if (pChar >= 'A' && pChar <= 'Z') {
        return true;
      }
     else {
        return pChar == '$';
      }
    }

    boolean method2(char c){
      if (c <= 32)   return false;
    switch (c) {
    case 127:case '(':case ')':case '<':case '>':case '@':case ',':case ';':case ':':case '\\':case '"':case '/':case '[':case ']':case '?':case '=':case '{':case '}':    return false;
    default:  return true;
    }
    }
}
