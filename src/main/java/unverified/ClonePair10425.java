package unverified;

public class ClonePair10425 {

    Integer method1(String source){
      if (source == null || source.trim().isEmpty()) {
        return null;
      }
      return Integer.valueOf(source);
    }

    Integer method2(String src){
      if (src == null || src.trim().length() == 0)   return null;
      return Integer.valueOf(src);
    }
}
