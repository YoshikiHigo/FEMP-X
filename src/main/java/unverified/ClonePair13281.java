package unverified;

public class ClonePair13281 {

    String method1(String lv,String rv){
      if (lv != null && rv != null) {
        do {
          int ix=lv.indexOf(rv);
          if (ix >= 0) {
            int len=lv.length();
            lv=lv.substring(0,ix) + lv.substring(ix + rv.length(),len);
          }
     else       break;
        }
     while (true);
      }
      return lv;
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
