package unverified;

public class ClonePair13285 {

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

    String method2(String s,String suffix){
      if (s == null || s.length() == 0 || suffix == null || suffix.length() == 0)   return s;
      if (s.endsWith(suffix)) {
        return s.substring(0,s.length() - suffix.length());
      }
     else   return s;
    }
}
