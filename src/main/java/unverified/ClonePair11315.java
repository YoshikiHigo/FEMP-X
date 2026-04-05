package unverified;

public class ClonePair11315 {

    Number method1(Number value1,Number value2){
      if (value1 == null) {
        return value2;
      }
      if (value2 == null) {
        return value1;
      }
      if (Float.compare(value1.floatValue(),value2.floatValue()) > 0) {
        return value1;
      }
     else {
        return value2;
      }
    }

    Number method2(Number value1,Number value2){
      if (value1 == null) {
        return value2;
      }
      if (value2 == null) {
        return value1;
      }
      if (value1.shortValue() > value2.shortValue()) {
        return value1;
      }
     else {
        return value2;
      }
    }
}
