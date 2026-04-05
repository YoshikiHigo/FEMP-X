package unverified;

public class ClonePair32 {

    Long method1(String str){
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

    Long method2(String value){
      if (value != null) {
        try {
          return Long.parseLong(value);
        }
     catch (    NumberFormatException e) {
        }
      }
      return null;
    }
}
