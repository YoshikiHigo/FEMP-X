package all;

public class ClonePair10124 {

    Integer method1(String str){
      if (str == null) {
        return null;
      }
      return Integer.decode(str);
    }

    Integer method2(String value){
      if (value == null)   return null;
      return Integer.parseInt(value.toString());
    }
}
