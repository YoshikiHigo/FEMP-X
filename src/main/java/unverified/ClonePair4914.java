package unverified;

public class ClonePair4914 {

    float method1(float angle){
      float a=angle;
      while (a > 180)   a-=360;
      while (a < -180)   a+=360;
      return a;
    }

    float method2(float angle){
      float a=angle;
      while (a > 180) {
        a-=360;
      }
      while (a < -180) {
        a+=360;
      }
      return a;
    }
}
