package unverified;

public class ClonePair11241 {

    boolean method1(char character){
      if (Character.isLetterOrDigit(character))   return true;
      if (character == '!')   return true;
      if (character == '_')   return true;
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
