package unverified;

public class ClonePair13272 {

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

    String method2(String s,String strToRemove){
      if (s == null || strToRemove == null)   return s;
      if (s.length() < strToRemove.length())   return s;
      int subLoc=s.length() - strToRemove.length();
      if (s.substring(subLoc).equalsIgnoreCase(strToRemove))   return s.substring(0,subLoc);
      return s;
    }
}
