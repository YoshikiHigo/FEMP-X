package all;

public class ClonePair8428 {

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
      int origLaenge=orig.length();
      if (compare.length() <= origLaenge && compare.equalsIgnoreCase(orig.substring(origLaenge - compare.length(),origLaenge))) {
        return orig.substring(0,orig.length() - compare.length());
      }
      return orig;
    }
}
