package unverified;

public class ClonePair11831 {

    boolean method1(char x){
      if ((x >= 'A' && x <= 'Z') || (x >= 'a' && x <= 'z') || x == '_')   return true;
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
