package all;

public class ClonePair8459 {

    Double method1(String doubleNumber){
      if (doubleNumber == null)   return null;
      try {
        return new Double(doubleNumber);
      }
     catch (  NumberFormatException nfx) {
        return null;
      }
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
