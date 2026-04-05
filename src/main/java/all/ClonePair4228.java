package all;

public class ClonePair4228 {

    float method1(float floor,float ceil,float value){
      if (value <= floor) {
        return 0;
      }
     else   if (value >= ceil) {
        return 1;
      }
     else {
        return (value - floor) / (ceil - floor);
      }
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
