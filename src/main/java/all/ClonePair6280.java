package all;

public class ClonePair6280 {

    int method1(int[] o1,int[] o2){
      int m1=o1[0];
      int m2=o2[0];
      if (m1 < m2)   return -1;
      if (m1 == m2)   return 0;
      return 1;
    }

    int method2(int[] arg0,int[] arg1){
      if (arg0[0] < arg1[0]) {
        return -1;
      }
     else   if (arg0[0] > arg1[0]) {
        return 1;
      }
     else {
        return 0;
      }
    }
}
