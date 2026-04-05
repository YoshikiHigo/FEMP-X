package all;

public class ClonePair8437 {

    Double method1(String valueString){
      if (valueString == null || valueString.equals(""))   return null;
      try {
        return Double.parseDouble(valueString);
      }
     catch (  Exception e) {
        return null;
      }
    }

    Double method2(String theDoubleValue){
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
}
