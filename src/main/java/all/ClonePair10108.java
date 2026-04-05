package all;

public class ClonePair10108 {

    Integer method1(String source){
      if (source == null) {
        return null;
      }
      try {
        return Integer.parseInt(source);
      }
     catch (  Exception e) {
        return null;
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
