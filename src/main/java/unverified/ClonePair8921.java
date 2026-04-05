package unverified;

public class ClonePair8921 {

    int method1(int[] elements,int start,int length){
      int sum=0;
      for (int j=0; j < length; j++)   sum+=elements[start + j];
      return sum;
    }

    int method2(int[] terms,int start,int len){
      int s=0;
      final int iSz=start + len;
      for (int i=start; i < iSz; i++) {
        s+=terms[i];
      }
      return s;
    }
}
