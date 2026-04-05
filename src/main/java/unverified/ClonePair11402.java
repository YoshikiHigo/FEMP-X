package unverified;

public class ClonePair11402 {

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

    boolean method2(char ch){
      if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9')|| ch == '_') {
        return true;
      }
      return false;
    }
}
