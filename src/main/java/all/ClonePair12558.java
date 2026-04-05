package all;

public class ClonePair12558 {

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

    boolean method2(String version){
      if (version == null || version.length() == 0) {
        return (false);
      }
      for (int i=0; i < version.length(); i++) {
        char c=version.charAt(i);
        if (!(Character.isDigit(c) || c == '.')) {
          return (false);
        }
      }
      if (version.startsWith(".") || version.endsWith(".") || version.indexOf("..") != -1) {
        return (false);
      }
      return (true);
    }
}
