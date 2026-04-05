package all;

public class ClonePair12709 {

    String method1(String input,String tail){
      if (input == null || tail == null || !input.endsWith(tail))   return input;
      return input.substring(0,input.length() - tail.length());
    }

    String method2(String orig,String compare){
      if (orig == null) {
        return null;
      }
      if (compare == null) {
        return orig;
      }
      int origLaenge=orig.length();
      if (compare.length() <= origLaenge && compare.equalsIgnoreCase(orig.substring(origLaenge - compare.length(),origLaenge))) {
        return orig.substring(0,orig.length() - compare.length());
      }
      return orig;
    }
}
