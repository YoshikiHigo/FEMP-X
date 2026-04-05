package unverified;

public class ClonePair8403 {

    String method1(String pvString,String pvCuttingString){
      if ((pvString != null) && (pvCuttingString != null) && (pvString.endsWith(pvCuttingString))) {
        return pvString.substring(0,(pvString.length() - pvCuttingString.length()));
      }
     else {
        return pvString;
      }
    }

    String method2(String lv,String rv){
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
}
