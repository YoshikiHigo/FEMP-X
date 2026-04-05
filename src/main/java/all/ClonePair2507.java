package all;

public class ClonePair2507 {

    Short method1(String value){
      if (value == null) {
        return null;
      }
      return Short.valueOf(value);
    }

    Short method2(String value){
      if (value == null)   return null;
      return Short.parseShort(value);
    }
}
