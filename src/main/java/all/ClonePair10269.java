package all;

public class ClonePair10269 {

    Integer method1(String string){
      if (string != null && string.length() != 0) {
        return Integer.valueOf(string);
      }
      return null;
    }

    Integer method2(String src){
      if (src == null || src.trim().length() == 0)   return null;
      return Integer.valueOf(src);
    }
}
