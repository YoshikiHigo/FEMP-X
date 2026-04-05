package unverified;

public class ClonePair6710 {

    int method1(int a,int b,int c){
      int mi;
      mi=a;
      if (b < mi)   mi=b;
      if (c < mi)   mi=c;
      return mi;
    }

    int method2(int i,int j,int k){
      if (i < j) {
        return (i < k) ? i : k;
      }
     else {
        return (j < k) ? j : k;
      }
    }
}
