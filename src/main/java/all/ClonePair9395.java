package all;

public class ClonePair9395 {

    int[] method1(int[] original,int start,int end){
      int[] copy=new int[end - start + 1];
      int j=0;
      for (int i=start; i <= end; i++) {
        copy[j]=original[i];
        j++;
      }
      return copy;
    }

    int[] method2(int[] in,int a,int b){
      int i=0;
      int x=a;
      int[] tmp=new int[b - a + 1];
      for (x=a; x <= b; x++, i++) {
        tmp[i]=in[x];
      }
      return tmp;
    }
}
