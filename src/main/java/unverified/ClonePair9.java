package unverified;

public class ClonePair9 {

    Long method1(String s){
      try {
        if (s != null) {
          return Long.decode(s);
        }
     else {
          return null;
        }
      }
     catch (  NumberFormatException e) {
        return null;
      }
    }

    Long method2(String str){
      if (str == null || "".equals(str.trim())) {
        return null;
      }
      if (str.endsWith(".0")) {
        str=str.substring(0,str.indexOf(".0"));
      }
      Long longObject=null;
      try {
        longObject=Long.valueOf(str);
      }
     catch (  Exception e) {
      }
      return longObject;
    }
}
