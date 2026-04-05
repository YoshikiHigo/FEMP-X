package all;

public class ClonePair6303 {

    int method1(int[] code1,int[] code2){
      if (code1.length != code2.length) {
        return -1;
      }
      int distance=0;
      for (int i=0; i < code1.length; i++) {
        if (code1[i] != code2[i]) {
          distance++;
        }
      }
      return distance;
    }

    int method2(int[] s1,int[] s2){
      if (s1.length != s2.length)   return -1;
      int counter=0;
      for (int k=0; k < s1.length; ++k)   if (s1[k] != s2[k])   ++counter;
      return counter;
    }
}
