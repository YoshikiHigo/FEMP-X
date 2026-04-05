package all;

public class ClonePair3943 {

    double method1(double y,double z){
      double angr=Math.atan(y / z);
      if (y < 0.) {
        if (z < 0.)     angr+=Math.PI;
     else     angr+=2. * Math.PI;
      }
     else {
        if (z < 0.)     angr+=Math.PI;
      }
      return angr;
    }

    double method2(double sineTerm,double cosineTerm){
      double tmpPhase=Math.atan(sineTerm / cosineTerm);
      if ((sineTerm == 0)) {
        if (cosineTerm > 0)     return 0;
     else     if (cosineTerm < 0)     return Math.PI;
      }
      if (sineTerm > 0) {
        if (cosineTerm > 0)     return tmpPhase;
     else     if (cosineTerm == 0)     return Math.PI / 2;
     else     if (cosineTerm < 0)     return tmpPhase + Math.PI;
      }
      if (sineTerm < 0) {
        if (cosineTerm > 0)     return tmpPhase + 2 * Math.PI;
     else     if (cosineTerm == 0)     return Math.PI * 3 / 2;
     else     if (cosineTerm < 0)     return tmpPhase + Math.PI;
      }
      return tmpPhase;
    }
}
