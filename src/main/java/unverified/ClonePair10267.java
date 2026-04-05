package unverified;

public class ClonePair10267 {

    Integer method1(String string){
      if (string != null && string.length() != 0) {
        return Integer.valueOf(string);
      }
      return null;
    }

    Integer method2(String source){
      if (source == null || source.trim().isEmpty()) {
        return null;
      }
      return Integer.valueOf(source);
    }
}
