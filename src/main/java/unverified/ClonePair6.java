package unverified;

public class ClonePair6 {

    Long method1(String source){
      if (source == null || source.trim().isEmpty()) {
        return null;
      }
      return Long.valueOf(source);
    }

    Long method2(String src){
      if (src == null || src.trim().length() == 0)   return null;
      return Long.valueOf(src);
    }
}
