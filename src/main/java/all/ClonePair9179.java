package all;

public class ClonePair9179 {

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
}
