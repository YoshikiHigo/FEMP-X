package unverified;

public class ClonePair12696 {

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
      if (compare.length() <= orig.length() && compare.equalsIgnoreCase(orig.substring(0,compare.length()))) {
        return orig.substring(compare.length(),orig.length());
      }
      return orig;
    }
}
