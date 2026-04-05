package all;

public class ClonePair8529 {

    Double method1(String value){
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
