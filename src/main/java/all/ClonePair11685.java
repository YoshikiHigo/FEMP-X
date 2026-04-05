package all;

public class ClonePair11685 {

    boolean method1(char c){
    switch (c) {
    case '\\':case '^':case '?':case '*':case '+':case '(':case ')':case '{':case '}':case '|':case '[':case ']':case '-':case '&':case '$':case '.':    return true;
    }
    return false;
    }

    boolean method2(char c){
      if (c >= 'A' && c <= 'Z')   return false;
      if (c >= 'a' && c <= 'z')   return false;
      if (c >= '0' && c <= '9')   return false;
      return true;
    }
}
