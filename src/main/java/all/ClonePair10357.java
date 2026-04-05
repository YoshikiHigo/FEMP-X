package all;

public class ClonePair10357 {

    Integer method1(String aString){
      if (aString == null || aString.trim().length() == 0) {
        return null;
      }
      return Integer.parseInt(aString);
    }

    Integer method2(String aString){
      if (aString == null || aString.trim().length() == 0) {
        return null;
      }
      return Integer.parseInt(aString.trim());
    }
}
