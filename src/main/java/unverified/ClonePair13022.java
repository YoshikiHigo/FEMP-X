package unverified;

public class ClonePair13022 {

    long method1(String value){
      try {
        if (value == null || value.length() == 0) {
          return 0;
        }
     else {
          if (value.charAt(0) == '+') {
            value=value.substring(1);
          }
          return Long.parseLong(value);
        }
      }
     catch (  Exception e) {
        return 0;
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
