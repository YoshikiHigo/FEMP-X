package all;

public class ClonePair10474 {

    Integer method1(String integerNumber){
      if (integerNumber == null)   return null;
      try {
        return new Integer(integerNumber);
      }
     catch (  NumberFormatException nfx) {
        return null;
      }
    }

    Integer method2(String data){
      if (data == null || data.length() == 0)   return null;
      try {
        return Integer.valueOf(data);
      }
     catch (  NumberFormatException e) {
        return null;
      }
    }
}
