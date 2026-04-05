package all;

public class ClonePair12048 {

    boolean method1(char c){
      if ('A' <= c && c <= 'Z')   return true;
      if ('a' <= c && c <= 'z')   return true;
      if ('0' <= c && c <= '9')   return true;
      if (c == '-' || c == '.')   return true;
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
