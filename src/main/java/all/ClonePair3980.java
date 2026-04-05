package all;

public class ClonePair3980 {

    float method1(float f,float f1){
      if (f == 0.0F && f1 == 0.0F)   return 0.0F;
     else   return (float)Math.sqrt(f * f + f1 * f1);
    }

    float method2(float a,float b){
      double r;
      if (Math.abs(a) > Math.abs(b)) {
        r=b / a;
        r=(float)(Math.abs(a) * Math.sqrt(1 + r * r));
      }
     else   if (b != 0) {
        r=a / b;
        r=(float)(Math.abs(b) * Math.sqrt(1 + r * r));
      }
     else {
        r=0.0f;
      }
      return (float)r;
    }
}
