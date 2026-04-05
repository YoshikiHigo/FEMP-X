package all;

public class ClonePair2928 {

    double method1(String value){
      if (value == null || value.length() == 0)   return 0;
      double d=0;
      try {
        d=Double.parseDouble(value);
      }
     catch (  Exception e) {
        d=0;
      }
      return d;
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
