package all;

public class ClonePair11269 {

    int method1(int[] list,int num){
      int i;
      int maxval;
      maxval=list[0];
      for (i=1; i < num; i++) {
        if (list[i] > maxval)     maxval=list[i];
      }
      return (maxval);
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
