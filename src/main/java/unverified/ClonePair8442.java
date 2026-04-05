package unverified;

public class ClonePair8442 {

    Double method1(String valueString){
      if (valueString == null || valueString.equals(""))   return null;
      try {
        return Double.parseDouble(valueString);
      }
     catch (  Exception e) {
        return null;
      }
    }

    Double method2(String value){
      if (value == null) {
        return null;
      }
      try {
        return new Double(value);
      }
     catch (  NumberFormatException e) {
        return null;
      }
    }
}
