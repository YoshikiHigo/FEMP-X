package unverified;

public class ClonePair11348 {

    int method1(int[] list,int num){
      int i;
      int minval;
      minval=list[0];
      for (i=1; i < num; i++) {
        if (list[i] < minval)     minval=list[i];
      }
      return (minval);
    }

    int method2(int[] array,int size){
      int mxm;
      mxm=array[0];
      for (int i=0; i < size; i++) {
        if (array[i] > mxm) {
          mxm=array[i];
        }
      }
      return mxm;
    }
}
