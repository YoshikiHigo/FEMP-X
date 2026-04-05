package all;

public class ClonePair40 {

    Long method1(String value){
      if (value == null) {
        return null;
      }
      return Long.valueOf(value);
    }

    Long method2(String str){
      if (str == null)   return null;
      return Long.parseLong(str);
    }
}
