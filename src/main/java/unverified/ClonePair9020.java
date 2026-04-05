package unverified;

public class ClonePair9020 {

    boolean method1(char c){
      if (c >= 'a' && c <= 'z')   return true;
      if (c >= 'A' && c <= 'Z')   return true;
      if (c >= '0' && c <= '9')   return true;
      return c == '_';
    }

    boolean method2(char ch){
      if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9')|| ch == '_') {
        return true;
      }
      return false;
    }
}
