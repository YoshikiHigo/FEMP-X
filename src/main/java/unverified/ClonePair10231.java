package unverified;

public class ClonePair10231 {

    Integer method1(String s){
      try {
        if (s != null) {
          return Integer.decode(s);
        }
     else {
          return null;
        }
      }
     catch (  NumberFormatException e) {
        return null;
      }
    }

    Integer method2(String str){
      if (str == null || str.equals("")) {
        return null;
      }
      try {
        return Integer.valueOf(str);
      }
     catch (  NumberFormatException e) {
      }
      return null;
    }
}
