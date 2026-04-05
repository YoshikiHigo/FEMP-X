package unverified;

public class ClonePair8433 {

    String method1(String pvString,String pvCuttingString){
      if ((pvString != null) && (pvCuttingString != null) && (pvString.endsWith(pvCuttingString))) {
        return pvString.substring(0,(pvString.length() - pvCuttingString.length()));
      }
     else {
        return pvString;
      }
    }

    String method2(String orig,String compare){
      if (orig == null) {
        return null;
      }
      if (compare == null) {
        return orig;
      }
      if (compare.length() <= orig.length() && compare.equals(orig.substring(0,compare.length()))) {
        return orig.substring(compare.length(),orig.length());
      }
      return orig;
    }
}
