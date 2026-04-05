package all;

public class ClonePair4924 {

    float method1(float d){
      if (d > 0f) {
        if (d < 1f) {
          return d;
        }
        return 1f;
      }
      return 0f;
    }

    float method2(float percent){
      if (percent <= 0)   return 0;
     else   if (percent > 1)   return 1;
     else   return percent;
    }
}
