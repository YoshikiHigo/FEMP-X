package unverified;

public class ClonePair9187 {

    boolean method1(char c){
      if ('a' <= c && c <= 'z')   return true;
      if ('A' <= c && c <= 'Z')   return true;
      if ('0' <= c && c <= '9')   return true;
      return false;
    }

    boolean method2(char ch){
      if (ch <= 'z' && 'a' <= ch) {
        return true;
      }
     else   if (ch <= 'Z' && 'A' <= ch) {
        return true;
      }
      return ch <= '9' && '0' <= ch;
    }
}
