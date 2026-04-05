package unverified;

public class ClonePair5509 {

    int[] method1(int[] x,int n){
      int[] S=new int[n];
      for (int i=0; i < x.length; i++) {
        int s=1;
        while ((s <= i) && (x[i - s] <= x[i])) {
          s=s + 1;
        }
        S[i]=s;
      }
      return S;
    }

    int[] method2(int[] i,int m){
      int[] in=new int[m];
      for (int j=0; j < i.length; j++)   in[j]=i[j];
      return in;
    }
}
