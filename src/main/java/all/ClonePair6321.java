package all;

public class ClonePair6321 {

    int method1(int[] ca,int[] cb){
      for (int i=0; i < ca.length; i++)   if (ca[i] < cb[i])   return -1;
     else   if (ca[i] > cb[i])   return 1;
      return 0;
    }

    int method2(int[] t1,int[] t2){
      for (int i=0; i < t1.length; i++) {
        if (t1[i] < t2[i])     return -1;
        if (t1[i] > t2[i])     return +1;
      }
      return 0;
    }
}
