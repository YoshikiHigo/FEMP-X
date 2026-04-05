package unverified;

public class ClonePair12548 {

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
      if (str == null || str.length() == 0)   return false;
      boolean digit=true;
      for (int i=0; i < str.length(); i++) {
        char c=str.charAt(i);
        if (c < '0' || c > '9') {
          digit=false;
          break;
        }
      }
      return digit;
    }
}
