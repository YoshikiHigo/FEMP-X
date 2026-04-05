package all;

public class ClonePair2819 {

    double method1(String x){
      if (x.length() <= 1 || !x.contains(",")) {
        return Double.parseDouble(x);
      }
     else {
        return Double.parseDouble(x.replace(",","."));
      }
    }

    double method2(String str){
      try {
        return Double.parseDouble(str);
      }
     catch (  Exception e) {
      }
      String sdeg=null;
      String smin=null;
      String ssec=null;
      int asterisk=str.indexOf('*');
      if (asterisk < 0) {
        sdeg=str;
      }
     else {
        sdeg=str.substring(0,asterisk);
        String srest=str.substring(asterisk + 1);
        int pound=srest.indexOf('#');
        if (pound < 0) {
          smin=srest;
        }
     else {
          smin=srest.substring(0,pound);
          ssec=srest.substring(pound + 1);
        }
      }
      double deg=Double.parseDouble(sdeg);
      double min=Double.parseDouble(smin);
      double sec=Double.parseDouble(ssec);
      return deg + (min / 60) + (sec / 3600);
    }
}
