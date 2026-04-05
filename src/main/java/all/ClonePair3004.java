package all;

public class ClonePair3004 {

    double method1(String s){
      int p=s.indexOf(".");
      if (p >= 0) {
        p=s.indexOf(".",p + 1);
      }
      if (p >= 0) {
        s=s.substring(0,p);
      }
      double d=0.0;
      try {
        d=Double.parseDouble(s);
      }
     catch (  NumberFormatException e) {
      }
      return d;
    }

    double method2(String str){
      double val=0;
      try {
        if (str.length() > 0)     val=Double.parseDouble(str);
      }
     catch (  NumberFormatException e) {
      }
      return val;
    }
}
