package all;

public class ClonePair6975 {

    int method1(int i1,int i2,int i3){
      if ((i1 < i2) && (i1 < i3))   return i1;
      return i2 < i3 ? i2 : i3;
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
