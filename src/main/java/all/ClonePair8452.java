package all;

public class ClonePair8452 {

    Double method1(String doubleNumber){
      if (doubleNumber == null)   return null;
      try {
        return new Double(doubleNumber);
      }
     catch (  NumberFormatException nfx) {
        return null;
      }
    }

    Double method2(String s){
      try {
        if (s != null) {
          return Double.parseDouble(s);
        }
     else {
          return null;
        }
      }
     catch (  NumberFormatException e) {
        return null;
      }
    }
}
