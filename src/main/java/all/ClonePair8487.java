package all;

public class ClonePair8487 {

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

    Double method2(String s){
      if (s != null && s.length() != 0) {
        try {
          return Double.valueOf(s.trim());
        }
     catch (    NumberFormatException e) {
        }
      }
      return null;
    }
}
