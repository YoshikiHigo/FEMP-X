package all;

public class ClonePair10174 {

    Integer method1(String value){
      if (value == null) {
        return null;
      }
      return Integer.valueOf(value);
    }

    Integer method2(String value){
      if (value == null)   return null;
      return Integer.parseInt(value.toString());
    }
}
