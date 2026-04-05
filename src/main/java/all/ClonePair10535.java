package all;

public class ClonePair10535 {

    Integer method1(String src){
      if (src == null || src.trim().length() == 0)   return null;
      return Integer.valueOf(src);
    }

    Integer method2(String aString){
      if (aString == null || aString.trim().length() == 0) {
        return null;
      }
      return Integer.parseInt(aString.trim());
    }
}
