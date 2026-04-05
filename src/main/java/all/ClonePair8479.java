package all;

public class ClonePair8479 {

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

    Double method2(String string){
      if (string == null)   return null;
      try {
        return new Double(string.trim());
      }
     catch (  Exception e) {
        return null;
      }
    }
}
