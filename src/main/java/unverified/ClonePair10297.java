package unverified;

public class ClonePair10297 {

    Integer method1(String indent){
      if (indent == null) {
        return null;
      }
     else {
        try {
          return Integer.parseInt(indent);
        }
     catch (    NumberFormatException e) {
          return null;
        }
      }
    }

    Integer method2(String integerNumber){
      if (integerNumber == null)   return null;
      try {
        return new Integer(integerNumber);
      }
     catch (  NumberFormatException nfx) {
        return null;
      }
    }
}
