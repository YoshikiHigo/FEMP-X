package all;

public class ClonePair9385 {

    int[] method1(int[] arr,int begin,int end){
      int n=end - begin;
      int[] result=new int[n];
      for (int i=begin; i < end; ++i) {
        result[i - begin]=arr[i];
      }
      return result;
    }

    int[] method2(int[] array,int fromIndex,int toIndex){
      int[] array2=new int[toIndex - fromIndex];
      for (int i=fromIndex; i < toIndex; i++)   array2[i - fromIndex]=array[i];
      return array2;
    }
}
