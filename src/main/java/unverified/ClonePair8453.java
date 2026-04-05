package unverified;

public class ClonePair8453 {

    Double method1(String doubleNumber){
      if (doubleNumber == null)   return null;
      try {
        return new Double(doubleNumber);
      }
     catch (  NumberFormatException nfx) {
        return null;
      }
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
