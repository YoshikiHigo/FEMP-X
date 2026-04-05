package unverified;

public class ClonePair5979 {

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

    float method2(String in){
      if (in == null || in.length() == 0)   return 0;
      try {
        return Float.parseFloat(in);
      }
     catch (  Exception e) {
        return 0;
      }
    }
}
