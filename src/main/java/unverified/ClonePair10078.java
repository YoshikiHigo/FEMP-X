package unverified;

public class ClonePair10078 {

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

    Integer method2(String stepNumberString){
      if (stepNumberString == null) {
        return null;
      }
      try {
        Integer theStepNumber=Integer.valueOf(stepNumberString);
        return theStepNumber;
      }
     catch (  NumberFormatException e) {
        return null;
      }
    }
}
