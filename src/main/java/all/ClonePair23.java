package all;

public class ClonePair23 {

    Long method1(String t){
      if (t != null) {
        return Long.parseLong(t);
      }
      return null;
    }

    Long method2(String value){
      if (value == null) {
        return null;
      }
      return Long.valueOf(value);
    }
}
