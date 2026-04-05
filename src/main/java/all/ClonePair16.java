package all;

public class ClonePair16 {

    Long method1(String value){
      if (value == null) {
        return null;
      }
      try {
        return Long.valueOf(value);
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
