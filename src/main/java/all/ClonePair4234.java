package all;

public class ClonePair4234 {

    float method1(float Aa,float Ba,float Ca){
      if (Aa > Ba && Aa > Ca) {
        return Aa;
      }
      if (Ba > Aa && Ba > Ca) {
        return Ba;
      }
      if (Ca > Ba && Ca > Aa) {
        return Ca;
      }
      if (Aa == Ba) {
        if (Aa > Ca)     return Aa;
     else     return Ca;
      }
      if (Aa == Ca) {
        if (Ba > Ca)     return Ba;
     else     return Ca;
      }
      if (Ca == Ba) {
        if (Aa > Ca)     return Aa;
     else     return Ca;
      }
      return Aa;
    }

    float method2(float r,float g,float b){
      float max=r;
      if (g > max)   max=g;
      if (b > max)   max=b;
      return max;
    }
}
