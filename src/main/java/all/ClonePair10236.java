package all;

public class ClonePair10236 {

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

    Integer method2(String string){
      if (string == null)   return null;
      try {
        return new Integer(string.trim());
      }
     catch (  Exception e) {
        return null;
      }
    }
}
