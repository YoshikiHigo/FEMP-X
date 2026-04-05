package unverified;

public class ClonePair24 {

    Long method1(String t){
      if (t != null) {
        return Long.parseLong(t);
      }
      return null;
    }

    Long method2(String str){
      if (str == null)   return null;
      return Long.parseLong(str);
    }
}
