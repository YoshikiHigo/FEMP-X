package all;

public class ClonePair6607 {

    double method1(double[] array,int start,int num){
      double sum=0;
      for (int i=start, stop=start + num; i < stop; i++) {
        sum+=array[i];
      }
      return sum / num;
    }

    double method2(double[] list,int current,int period){
      double result=0;
      for (int i=current; i > current - period; i--) {
        result+=list[i];
      }
      return result / (double)period;
    }
}
