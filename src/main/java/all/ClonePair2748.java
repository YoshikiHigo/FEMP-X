package all;

public class ClonePair2748 {

    double method1(String s){
      if (s == null || s.isEmpty()) {
        return 0.0d;
      }
      try {
        return Double.parseDouble(s);
      }
     catch (  Throwable t) {
        return 0.0d;
      }
    }

    double method2(String str){
      String loghead=new String("TypeConver:str2float:");
      double ret=0.00;
      try {
        boolean flag=(null == str);
        flag=flag || (str.trim().length() < 1);
        if (flag) {
          ret=0.00;
        }
     else {
          ret=Double.parseDouble(str);
        }
      }
     catch (  NumberFormatException e) {
        ret=0.00;
      }
      return ret;
    }
}
