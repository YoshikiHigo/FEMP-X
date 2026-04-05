package all;

public class ClonePair13253 {

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
      if (compare.length() <= orig.length() && compare.equalsIgnoreCase(orig.substring(0,compare.length()))) {
        return orig.substring(compare.length(),orig.length());
      }
      return orig;
    }
}
