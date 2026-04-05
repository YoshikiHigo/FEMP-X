package unverified;

public class ClonePair8474 {

    Double method1(String s){
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
