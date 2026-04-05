package all;

public class ClonePair41 {

    Long method1(String value){
      if (value == null) {
        return null;
      }
      return Long.valueOf(value);
    }

    Long method2(String number){
      if (number == null) {
        return null;
      }
     else {
        return new Long(number);
      }
    }
}
