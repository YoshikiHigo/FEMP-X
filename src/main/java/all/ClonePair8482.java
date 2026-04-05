package all;

public class ClonePair8482 {

    Double method1(String theDoubleValue){
      if (theDoubleValue == null || theDoubleValue.length() == 0) {
        return null;
      }
      Double parsedDouble=null;
      try {
        parsedDouble=Double.parseDouble(theDoubleValue);
      }
     catch (  Exception anException) {
        return null;
      }
      return parsedDouble;
    }

    Double method2(String str){
      if (str == null) {
        return null;
      }
      try {
        return Double.valueOf(str);
      }
     catch (  NumberFormatException ex) {
        return null;
      }
    }
}
