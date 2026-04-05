package all;

public class ClonePair8485 {

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

    Double method2(String value){
      if (value != null) {
        try {
          return Double.parseDouble(value);
        }
     catch (    NumberFormatException e) {
        }
      }
      return null;
    }
}
