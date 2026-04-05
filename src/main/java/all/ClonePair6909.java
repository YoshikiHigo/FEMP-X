package all;

public class ClonePair6909 {

    int method1(int x,int y,int z){
      if (x > y)   if (x > z)   return x;
     else   return z;
     else   if (y > z)   return y;
     else   return z;
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
