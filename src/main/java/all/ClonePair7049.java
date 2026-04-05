package all;

public class ClonePair7049 {

    double method1(double[] x,double[] y,double mx,double my){
      double tot=0.0;
      for (int i=0; i < x.length; i++)   tot+=(x[i] - mx) * (y[i] - my);
      return tot;
    }

    double method2(double[] xs,double[] ys,double meanXs,double meanYs){
      double sum=0.0;
      for (int i=0; i < xs.length; ++i)   sum+=(xs[i] - meanXs) * (ys[i] - meanYs);
      return sum;
    }
}
