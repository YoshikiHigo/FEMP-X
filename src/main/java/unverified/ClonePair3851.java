package unverified;

public class ClonePair3851 {

    double method1(double[] x1,double[] x2){
      int counter=0;
      double sum1=0.0;
      double sum2=0.0;
      double sumS1=0.0;
      double sumS2=0.0;
      for (int i=0; i < x1.length; i++) {
        sum1=sum1 + x1[i];
        sum2=sum2 + x2[i];
        counter++;
      }
      double mean1=sum1 / counter;
      double mean2=sum2 / counter;
      double sum=0.0;
      counter=0;
      for (int i=0; i < x1.length; i++) {
        sum=sum + (x1[i] - mean1) * (x2[i] - mean2);
        sumS1=sumS1 + (x1[i] - mean1) * (x1[i] - mean1);
        sumS2=sumS2 + (x2[i] - mean2) * (x2[i] - mean2);
        counter++;
      }
      return sum / Math.sqrt(sumS1 * sumS2);
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
