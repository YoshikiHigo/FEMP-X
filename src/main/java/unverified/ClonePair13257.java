package unverified;

public class ClonePair13257 {

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

    String method2(String string,String separator){
      if (string == null || separator == null)   return string;
      int k=string.lastIndexOf(separator);
      if (k < 0)   return string;
     else   return string.substring(k + separator.length());
    }
}
