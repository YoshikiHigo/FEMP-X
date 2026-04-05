package unverified;

public class ClonePair9114 {

    double method1(double value){
      if (value > 1)   value=1;
      if (value < -1)   value=-1;
      return value;
    }

    double method2(double __value){
      System.out.println("Environment.applyPiecewiseLinearFunction(-) - [warning] - check source for exact definition.");
      if (__value < -1)   return (-1);
     else   if (__value > 1)   return (1);
     else   return (__value);
    }
}
