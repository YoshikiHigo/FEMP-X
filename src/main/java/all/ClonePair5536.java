package all;

public class ClonePair5536 {

    int method1(int i,int[] partitions){
      while (partitions[i] != i)   i=partitions[i];
      return i;
    }

    int method2(int i,int[] ptrs){
      int ind=i;
      while (ind != ptrs[ind]) {
        ind=ptrs[ind];
      }
      ptrs[i]=ind;
      return ind;
    }
}
