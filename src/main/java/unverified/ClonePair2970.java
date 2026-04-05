package unverified;

public class ClonePair2970 {

    double method1(String s){
      double res=0;
      try {
        if (s.equals(""))     return 0;
        res=Double.parseDouble(s.trim());
      }
     catch (  NumberFormatException nfe) {
        System.out.println("NumberFormatException: " + nfe.getMessage());
      }
      return res;
    }

    double method2(String s){
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
}
