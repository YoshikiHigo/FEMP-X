package all;

public class ClonePair5 {

    Long method1(String s){
      if (s == null || s.length() == 0) {
        return null;
      }
      if (s.endsWith("(sec)")) {
        return Long.parseLong(s.substring(0,s.length() - "(sec)".length()));
      }
     else {
        return Long.parseLong(s);
      }
    }

    Long method2(String src){
      if (src == null || src.trim().length() == 0)   return null;
      return Long.valueOf(src);
    }
}
