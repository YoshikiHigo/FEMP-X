package unverified;

public class ClonePair10404 {

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

    @SuppressWarnings("nls") Integer method2(String str){
      if ((str != null) && (str.length() > 0)) {
        try {
          return Integer.valueOf(str);
        }
     catch (    NumberFormatException e) {
          e.printStackTrace();
        }
      }
      return null;
    }
}
