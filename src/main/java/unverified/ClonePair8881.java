package unverified;

public class ClonePair8881 {

    boolean method1(char c){
      if (c >= 'a' && c <= 'z')   return true;
      if (c >= 'A' && c <= 'Z')   return true;
      if (c >= '0' && c <= '9')   return true;
      if (c == '_' || c == '-')   return true;
      return false;
    }

    boolean method2(char c){
      if (c == '_') {
        return true;
      }
      if (c == '-') {
        return true;
      }
      if ((c >= '0') && (c <= '9')) {
        return true;
      }
      if ((c >= 'A') && (c <= 'Z')) {
        return true;
      }
      if ((c >= 'a') && (c <= 'z')) {
        return true;
      }
      return false;
    }
}
