package all;

public class ClonePair7287 {

    double method1(int[] y,int j){
      double x=0;
      for (int i=0; i <= j; i++)   x+=i * y[i];
      return x;
    }

    double method2(int[] y,int j){
      double x=0;
      for (int i=0; i <= j; i++)   x+=i * i * y[i];
      return x;
    }
}
