package unverified;

public class ClonePair5980 {

    float method1(String str){
      String loghead=new String("TypeConver:str2float:");
      float ret=0;
      try {
        boolean flag=(null == str);
        flag=flag || (str.trim().length() < 1);
        if (flag) {
          ret=0;
        }
     else {
          ret=Float.parseFloat(str);
        }
      }
     catch (  NumberFormatException e) {
        ret=0;
      }
      return ret;
    }

    float method2(String s){
      if (s == null || s.isEmpty()) {
        return 0.0f;
      }
      try {
        return Float.parseFloat(s);
      }
     catch (  Throwable t) {
        return 0.0f;
      }
    }
}
