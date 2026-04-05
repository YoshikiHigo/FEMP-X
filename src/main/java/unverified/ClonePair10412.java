package unverified;

public class ClonePair10412 {

    Integer method1(String stepNumberString){
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

    Integer method2(String value){
      if (value == null) {
        return null;
      }
      try {
        return Integer.valueOf(value);
      }
     catch (  NumberFormatException ex) {
        return null;
      }
    }
}
