package all;

public class ClonePair12538 {

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

    boolean method2(String name){
      if (name == null)   return false;
      if (name.length() == 0)   return false;
      boolean safeChars=name.matches("[a-zA-Z0-9-_.]*");
      boolean doubleDot=(name.indexOf("..") >= 0);
      boolean hidden=name.startsWith(".");
      boolean root=name.startsWith("/");
      boolean legal=safeChars & !doubleDot & !hidden& !root;
      return legal;
    }
}
