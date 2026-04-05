package all;

public class ClonePair10075 {

    Integer method1(String str){
      if (str == null || "".equals(str.trim())) {
        return null;
      }
      if (str.endsWith(".0")) {
        str=str.substring(0,str.indexOf(".0"));
      }
      Integer integerObject=null;
      try {
        integerObject=Integer.valueOf(str);
      }
     catch (  Exception e) {
      }
      return integerObject;
    }

    Integer method2(String indent){
      if (indent == null) {
        return null;
      }
     else {
        try {
          return Integer.parseInt(indent);
        }
     catch (    NumberFormatException e) {
          return null;
        }
      }
    }
}
