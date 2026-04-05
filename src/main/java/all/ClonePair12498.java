package all;

public class ClonePair12498 {

    boolean method1(String ref){
      if (ref == null || ref.trim().length() == 0)   return (false);
      char c;
      for (int i=0; i < ref.length(); i++) {
        c=ref.charAt(i);
        if (!(c >= '0' && c <= '9')) {
          return (false);
        }
      }
      return true;
    }

    boolean method2(String str){
      if (str == null || str.length() == 0) {
        return false;
      }
      for (int i=0; i < str.length(); i++) {
        char c=str.charAt(i);
        if (c != '+' && c != '-' && (c < '0' || c > '9')) {
          return false;
        }
      }
      return true;
    }
}
