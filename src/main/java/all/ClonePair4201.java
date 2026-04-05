package all;

public class ClonePair4201 {

    float method1(float a,float b,float x){
      if (x < a)   return 0;
      if (x >= b)   return 1;
      x=(x - a) / (b - a);
      return x * x * (3 - 2 * x);
    }

    float method2(float a,float b,float x){
      if (x < a) {
        return 0;
      }
      if (x >= b) {
        return 1;
      }
      x=(x - a) / (b - a);
      return x * x * (3 - 2 * x);
    }
}
