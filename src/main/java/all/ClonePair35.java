package all;

public class ClonePair35 {

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

    Long method2(String text){
      if (text == null) {
        return null;
      }
      try {
        return (Long.parseLong(text));
      }
     catch (  NumberFormatException e) {
        return null;
      }
    }
}
