package all;

public class ClonePair9433 {

    double method1(double __value){
      System.out.println("Environment.applyPiecewiseLinearFunction(-) - [warning] - check source for exact definition.");
      if (__value < -1)   return (-1);
     else   if (__value > 1)   return (1);
     else   return (__value);
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
