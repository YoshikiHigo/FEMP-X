package all;

public class ClonePair13319 {

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

    String method2(String text,String suffix){
      if (text == null) {
        return null;
      }
      if (suffix == null) {
        return text;
      }
      if (text.endsWith(suffix)) {
        return text.substring(0,text.length() - suffix.length());
      }
      return text;
    }
}
