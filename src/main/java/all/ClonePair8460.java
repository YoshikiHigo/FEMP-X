package all;

public class ClonePair8460 {

    Double method1(String doubleNumber){
      if (doubleNumber == null)   return null;
      try {
        return new Double(doubleNumber);
      }
     catch (  NumberFormatException nfx) {
        return null;
      }
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
