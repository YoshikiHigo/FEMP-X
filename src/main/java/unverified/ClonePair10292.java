package unverified;

public class ClonePair10292 {

    double method1(double z){
      double zabs;
      double p;
      double expntl, pdf;
      final double p0=220.2068679123761;
      final double p1=221.2135961699311;
      final double p2=112.0792914978709;
      final double p3=33.91286607838300;
      final double p4=6.373962203531650;
      final double p5=.7003830644436881;
      final double p6=.3526249659989109E-01;
      final double q0=440.4137358247522;
      final double q1=793.8265125199484;
      final double q2=637.3336333788311;
      final double q3=296.5642487796737;
      final double q4=86.78073220294608;
      final double q5=16.06417757920695;
      final double q6=1.755667163182642;
      final double q7=.8838834764831844E-1;
      final double cutoff=7.071;
      final double root2pi=2.506628274631001;
      zabs=Math.abs(z);
      if (z > 37.0) {
        p=1.0;
        return p;
      }
      if (z < -37.0) {
        p=0.0;
        return p;
      }
      expntl=Math.exp(-.5 * zabs * zabs);
      pdf=expntl / root2pi;
      if (zabs < cutoff) {
        p=expntl * ((((((p6 * zabs + p5) * zabs + p4) * zabs + p3) * zabs + p2) * zabs + p1) * zabs + p0) / (((((((q7 * zabs + q6) * zabs + q5) * zabs + q4) * zabs + q3) * zabs + q2) * zabs + q1) * zabs + q0);
      }
     else {
        p=pdf / (zabs + 1.0 / (zabs + 2.0 / (zabs + 3.0 / (zabs + 4.0 / (zabs + 0.65)))));
      }
      if (z < 0.0) {
        return p;
      }
     else {
        p=1.0 - p;
        return p;
      }
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
