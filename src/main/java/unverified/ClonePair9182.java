package unverified;

public class ClonePair9182 {

    double method1(double z){
      double y, x, w;
      double Z_MAX=6.0;
      if (z == 0.0) {
        x=0.0;
      }
     else {
        y=0.5 * Math.abs(z);
        if (y >= (Z_MAX * 0.5)) {
          x=1.0;
        }
     else     if (y < 1.0) {
          w=y * y;
          x=((((((((0.000124818987 * w - 0.001075204047) * w + 0.005198775019) * w - 0.019198292004) * w + 0.059054035642) * w - 0.151968751364) * w + 0.319152932694) * w - 0.531923007300) * w + 0.797884560593) * y * 2.0;
        }
     else {
          y-=2.0;
          x=(((((((((((((-0.000045255659 * y + 0.000152529290) * y - 0.000019538132) * y - 0.000676904986) * y + 0.001390604284) * y - 0.000794620820) * y - 0.002034254874) * y + 0.006549791214) * y - 0.010557625006) * y + 0.011630447319) * y - 0.009279453341) * y + 0.005353579108) * y - 0.002141268741) * y + 0.000535310849) * y + 0.999936657524;
        }
      }
      return z > 0.0 ? ((x + 1.0) * 0.5) : ((1.0 - x) * 0.5);
    }

    double method2(double z){
      if (z > 6.0)   return 1.0;
      if (z < -6.0)   return 0.0;
      final double b1=0.31938153;
      final double b2=-0.356563782;
      final double b3=1.781477937;
      final double b4=-1.821255978;
      final double b5=1.330274429;
      final double p=0.2316419;
      final double c2=0.3989423;
      final double a=Math.abs(z);
      final double t=1.0 / (1.0 + a * p);
      final double b=c2 * Math.exp((-z) * (z / 2.0));
      double n=((((b5 * t + b4) * t + b3) * t + b2) * t + b1) * t;
      n=1.0 - b * n;
      if (z < 0.0)   n=1.0 - n;
      return n;
    }
}
