package unverified;

public class ClonePair9392 {

    int[] method1(int[] array,int fromIndex,int toIndex){
      int[] array2=new int[toIndex - fromIndex];
      for (int i=fromIndex; i < toIndex; i++)   array2[i - fromIndex]=array[i];
      return array2;
    }

    int[] method2(int[] A,int start,int last){
      int[] ret=new int[last - start];
      for (int i=0; i < ret.length; i++)   ret[i]=A[start + i];
      return ret;
    }
}
