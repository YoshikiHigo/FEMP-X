package unverified;

public class ClonePair10081 {

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

    Integer method2(String integerNumber){
      if (integerNumber == null)   return null;
      try {
        return new Integer(integerNumber);
      }
     catch (  NumberFormatException nfx) {
        return null;
      }
    }
}
