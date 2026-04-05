package all;

public class ClonePair9778 {

    double method1(int D,int M,double S){
      double sign;
      if ((D < 0) || (M < 0) || (S < 0))   sign=-1.0;
     else   sign=1.0;
      return sign * (Math.abs(D) + Math.abs(M) / 60.0 + Math.abs(S) / 3600.0);
    }

    double method2(int D,int M,double S){
      double sign;
      if ((D < 0) || (M < 0) || (S < 0)) {
        sign=-1.0;
      }
     else {
        sign=1.0;
      }
      return sign * (Math.abs(D) + Math.abs(M) / 60.0 + Math.abs(S) / 3600.0);
    }
}
