package all;

public class ClonePair11268 {

    int method1(int[] list,int num){
      int i;
      int maxval;
      maxval=list[0];
      for (i=1; i < num; i++) {
        if (list[i] > maxval)     maxval=list[i];
      }
      return (maxval);
    }

    int method2(int[] list,int num){
      int i;
      int minval;
      minval=list[0];
      for (i=1; i < num; i++) {
        if (list[i] < minval)     minval=list[i];
      }
      return (minval);
    }
}
