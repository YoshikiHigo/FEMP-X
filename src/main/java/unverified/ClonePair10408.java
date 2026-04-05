package unverified;

public class ClonePair10408 {

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

    Integer method2(String response){
      if (response == null) {
        return null;
      }
      try {
        Integer parsed=Integer.parseInt(response);
        return parsed;
      }
     catch (  NumberFormatException e) {
        return null;
      }
    }
}
