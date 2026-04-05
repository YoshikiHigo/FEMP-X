package unverified;

public class ClonePair10111 {

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
