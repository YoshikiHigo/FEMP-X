package unverified;

public class ClonePair10103 {

    Integer method1(String source){
      if (source == null) {
        return null;
      }
      try {
        return Integer.parseInt(source);
      }
     catch (  Exception e) {
        return null;
      }
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
