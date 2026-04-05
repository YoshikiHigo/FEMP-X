package unverified;

public class ClonePair11786 {

    boolean method1(char ch){
      if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9')|| ch == '_') {
        return true;
      }
      return false;
    }

    boolean method2(char c){
      if (c <= 32)   return false;
    switch (c) {
    case 127:case '(':case ')':case '<':case '>':case '@':case ',':case ';':case ':':case '\\':case '"':case '/':case '[':case ']':case '?':case '=':case '{':case '}':    return false;
    default:  return true;
    }
    }
}
