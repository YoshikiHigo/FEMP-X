package unverified;

public class ClonePair10344 {

    Integer method1(String aString){
      if (aString == null || aString.trim().length() == 0) {
        return null;
      }
      return Integer.parseInt(aString);
    }

    Integer method2(String source){
      if (source == null || source.trim().isEmpty()) {
        return null;
      }
      return Integer.valueOf(source);
    }
}
