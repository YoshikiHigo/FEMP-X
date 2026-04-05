package all;

public class ClonePair13263 {

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

    String method2(String text,String separator){
      int index;
      if ((text == null) || (separator == null))   return text;
      index=text.lastIndexOf(separator);
      if (index < 0)   return text;
      return text.substring(0,index);
    }
}
