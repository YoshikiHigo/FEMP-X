package all;

public class ClonePair3880 {

    double method1(double[] input1,double[] input2){
      double correlation=-2;
      double xy, x, y, x2, y2;
      xy=x=y=x2=y2=0;
      for (int i=0; i < input1.length; i++) {
        xy+=input1[i] * input2[i];
        x+=input1[i];
        y+=input2[i];
        x2+=input1[i] * input1[i];
        y2+=input2[i] * input2[i];
      }
      correlation=xy - x * (y / input1.length);
      correlation/=Math.sqrt(x2 - x * (x / input1.length));
      correlation/=Math.sqrt(y2 - y * (y / input1.length));
      return correlation;
    }

    double method2(double[] x,double[] y){
      double N=x.length;
      double xTot=0;
      double yTot=0;
      double sqrXTot=0;
      double sqrYTot=0;
      double xYTot=0;
      for (int i=0; i < N; i++) {
        xTot+=x[i];
        yTot+=y[i];
        sqrXTot+=Math.pow(x[i],2);
        sqrYTot+=Math.pow(y[i],2);
        xYTot+=(x[i] * y[i]);
      }
      double top=(N * xYTot) - (xTot * yTot);
      double botLeft=Math.sqrt((N * sqrXTot) - Math.pow(xTot,2));
      double botRight=Math.sqrt((N * sqrYTot) - Math.pow(yTot,2));
      return top / (botLeft * botRight);
    }
}
