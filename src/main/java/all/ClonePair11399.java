package all;

public class ClonePair11399 {

    boolean method1(char charAt){
      if (charAt >= 'a' && charAt <= 'z') {
        return true;
      }
      if (charAt >= 'A' && charAt <= 'Z') {
        return true;
      }
      if (charAt >= '0' && charAt <= '9') {
        return true;
      }
      if (charAt == '_') {
        return true;
      }
      return false;
    }

    boolean method2(char c){
    switch (c) {
    case '<':case '>':case '(':case ')':case '[':case ']':case '{':case '}':    return false;
    }
    return true;
    }
}
