package all;

public class ClonePair2981 {

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
