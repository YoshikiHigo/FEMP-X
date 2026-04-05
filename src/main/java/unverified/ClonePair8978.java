package unverified;

public class ClonePair8978 {

    double method1(double value){
      if (value > 1) {
        value=1;
      }
      if (value < -1) {
        value=-1;
      }
      return value;
    }

    double method2(double num){
      if (num > 1.0) {
        return 1.0;
      }
      if (num < -1.0) {
        return -1.0;
      }
      return num;
    }
}
