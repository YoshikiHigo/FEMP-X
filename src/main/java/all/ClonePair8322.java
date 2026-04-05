package all;

public class ClonePair8322 {

    double[] method1(double[] xd,double[] k){
      double k1=k[0];
      double k2=k[1];
      double k3=k.length > 4 ? k[4] : 0;
      double k4=k.length > 5 ? k[5] : 0;
      double k5=k.length > 6 ? k[6] : 0;
      double k6=k.length > 7 ? k[7] : 0;
      double p1=k[2];
      double p2=k[3];
      double[] xu=xd.clone();
      for (int i=0; i < xd.length / 2; i++) {
        double x=xu[i * 2], y=xu[i * 2 + 1];
        double xo=xd[i * 2], yo=xd[i * 2 + 1];
        for (int j=0; j < 20; j++) {
          double r_2=x * x + y * y;
          double k_radial=1 + k1 * r_2 + k2 * r_2 * r_2 + k3 * r_2 * r_2* r_2;
          double delta_x=2 * p1 * x* y + p2 * (r_2 + 2 * x * x);
          double delta_y=p1 * (r_2 + 2 * y * y) + 2 * p2 * x* y;
          x=(xo - delta_x) / k_radial;
          y=(yo - delta_y) / k_radial;
        }
        xu[i * 2]=x;
        xu[i * 2 + 1]=y;
      }
      return xu;
    }

    double[] method2(double[] xu,double[] k){
      double k1=k[0];
      double k2=k[1];
      double k3=k.length > 4 ? k[4] : 0;
      double k4=k.length > 5 ? k[5] : 0;
      double k5=k.length > 6 ? k[6] : 0;
      double k6=k.length > 7 ? k[7] : 0;
      double p1=k[2];
      double p2=k[3];
      double[] xd=xu.clone();
      for (int i=0; i < xu.length / 2; i++) {
        double x=xu[i * 2], y=xu[i * 2 + 1];
        double r_2=x * x + y * y;
        double k_radial=1 + k1 * r_2 + k2 * r_2 * r_2 + k3 * r_2 * r_2* r_2;
        double delta_x=2 * p1 * x* y + p2 * (r_2 + 2 * x * x);
        double delta_y=p1 * (r_2 + 2 * y * y) + 2 * p2 * x* y;
        xd[i * 2]=x * k_radial + delta_x;
        xd[i * 2 + 1]=y * k_radial + delta_y;
      }
      return xd;
    }
}
