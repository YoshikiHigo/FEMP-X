package all;

public class ClonePair7013 {

    int method1(int i,int j,int k){
      if (i < j) {
        return (i < k) ? i : k;
      }
     else {
        return (j < k) ? j : k;
      }
    }

    int method2(int a1,int a2,int a3){
      if (a1 < a2) {
        if (a1 < a3) {
          return a1;
        }
     else {
          return a3;
        }
      }
     else {
        if (a2 < a3) {
          return a2;
        }
     else {
          return a3;
        }
      }
    }
}
