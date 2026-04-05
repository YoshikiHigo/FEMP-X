package unverified;

public class ClonePair13255 {

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

    String method2(String srcStr,String cutStr){
      if (srcStr == null || cutStr == null) {
        return srcStr;
      }
      String retStr=srcStr;
      if (retStr.endsWith(cutStr)) {
        retStr=retStr.substring(0,retStr.length() - cutStr.length());
      }
      return retStr;
    }
}
