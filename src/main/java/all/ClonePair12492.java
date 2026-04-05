package all;

public class ClonePair12492 {

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

    boolean method2(String s){
      if (s == null || s.length() == 0) {
        return false;
      }
      final int size=s.length();
      for (int i=0; i < size; i++) {
        final char chr=s.charAt(i);
        if (chr < '0' || '9' < chr) {
          return false;
        }
      }
      return true;
    }
}
