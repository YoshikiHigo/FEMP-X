package all;

public class ClonePair8486 {

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
      if (str == null || "".equals(str.trim())) {
        return null;
      }
      Double doubleObject=null;
      try {
        doubleObject=Double.valueOf(str);
      }
     catch (  Exception e) {
      }
      return doubleObject;
    }
}
