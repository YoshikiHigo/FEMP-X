package all;

public class ClonePair13015 {

    long method1(String s){
      if (s == null || s.isEmpty()) {
        return 0L;
      }
      try {
        return Long.parseLong(s,16);
      }
     catch (  Throwable t) {
        return 0L;
      }
    }

    long method2(String str){
      String loghead=new String("TypeConver:str2float:");
      long ret=0l;
      try {
        boolean flag=(null == str);
        flag=flag || (str.trim().length() < 1);
        if (flag) {
          ret=0l;
        }
     else {
          ret=Long.parseLong(str);
        }
      }
     catch (  NumberFormatException e) {
        ret=0l;
      }
      return ret;
    }
}
