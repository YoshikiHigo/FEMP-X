package all;

public class ClonePair13316 {

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

    String method2(String sSource,String sEndsWith){
      if (null == sSource)   return null;
     else   if (sEndsWith == null)   return sSource;
     else   if (sSource.length() < sEndsWith.length())   return sSource;
     else   if (sSource.endsWith(sEndsWith))   return sSource.substring(0,sSource.length() - sEndsWith.length());
     else   return sSource;
    }
}
