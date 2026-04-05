package unverified;

public class ClonePair6970 {

    int method1(int i1,int i2,int i3){
      if ((i1 < i2) && (i1 < i3))   return i1;
      return i2 < i3 ? i2 : i3;
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
