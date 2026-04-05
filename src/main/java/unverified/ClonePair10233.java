package unverified;

public class ClonePair10233 {

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
