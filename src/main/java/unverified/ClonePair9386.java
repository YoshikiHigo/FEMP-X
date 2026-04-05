package unverified;

public class ClonePair9386 {

    int[] method1(int[] arr,int begin,int end){
      int n=end - begin;
      int[] result=new int[n];
      for (int i=begin; i < end; ++i) {
        result[i - begin]=arr[i];
      }
      return result;
    }

    int[] method2(int[] A,int start,int last){
      int[] ret=new int[last - start];
      for (int i=0; i < ret.length; i++)   ret[i]=A[start + i];
      return ret;
    }
}
