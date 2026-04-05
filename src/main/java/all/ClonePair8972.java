package all;

public class ClonePair8972 {

    double method1(double value){
      if (value > 1) {
        value=1;
      }
      if (value < -1) {
        value=-1;
      }
      return value;
    }

    double method2(double value){
      if (value > 1)   value=1;
      if (value < -1)   value=-1;
      return value;
    }
}
