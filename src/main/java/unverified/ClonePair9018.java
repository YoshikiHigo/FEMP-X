package unverified;

public class ClonePair9018 {

    boolean method1(char c){
      if (c >= 'a' && c <= 'z')   return true;
      if (c >= 'A' && c <= 'Z')   return true;
      if (c >= '0' && c <= '9')   return true;
      return c == '_';
    }

    boolean method2(char charAt){
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
}
