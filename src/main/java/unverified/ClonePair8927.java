package unverified;

public class ClonePair8927 {

    int method1(int[] differences,int start,int toTake){
      int sum=0;
      for (int i=0; i < toTake; i++) {
        sum+=differences[start + i];
      }
      return sum;
    }

    int method2(int[] terms,int start,int len){
      int s=0;
      for (int i=start, iSz=start + len; i < iSz; i++)   s+=terms[i];
      return s;
    }
}
