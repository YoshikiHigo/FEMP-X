package unverified;

public class ClonePair6809 {

    int method1(int i1,int i2,int i3){
      int max=i1;
      if (i2 > i1) {
        max=i2;
      }
      if (i3 > max) {
        max=i3;
      }
      return max;
    }

    int method2(int a1,int a2,int a3){
      if (a1 >= a2 && a1 >= a3) {
        return a1;
      }
     else   if (a2 >= a1 && a2 >= a3) {
        return a2;
      }
     else   return a3;
    }
}
