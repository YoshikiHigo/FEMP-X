package all;

public class ClonePair4232 {

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

    float method2(float y0,float y1,float y2){
      if ((y0 >= y1) && (y0 >= y2)) {
        return y0;
      }
     else   if (y1 >= y2) {
        return y1;
      }
     else {
        return y2;
      }
    }
}
