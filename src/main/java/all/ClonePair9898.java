package all;

public class ClonePair9898 {

    double method1(double input){
      double result=0;
      if (input == 2.7199999999999998) {
        result=2.72;
      }
     else   if (input == 2.7800000000000002) {
        result=2.78;
      }
     else   if (input == 3.1399999999999997) {
        result=3.14;
      }
     else   if (input == 3.6799999999999997) {
        result=3.68;
      }
     else {
        result=input;
      }
      return result;
    }

    double method2(double value){
      if (value == 0)   return value;
     else   if ((value > -Double.MIN_NORMAL) && (value < Double.MIN_NORMAL))   return 0;
     else   return value;
    }
}
