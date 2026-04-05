package all;

public class ClonePair4937 {

    float method1(float x){
      if (Float.isNaN(x))   return Float.NaN;
      if (x == 0)   return 0;
      if (x < -5)   return -1;
     else   if (x > 5)   return 1;
      double z=Math.abs(x);
      double s=Math.exp(2 * z);
      z=1.0 - 2.0 / (s + 1.0);
      if (x < 0)   z=-z;
      return (float)z;
    }

    float method2(float x){
      if (x < -3)   return -1;
      if (x > 3)   return 1;
      final float x2=x * x;
      return x * (27 + x2) / (27 + 9 * x2);
    }
}
