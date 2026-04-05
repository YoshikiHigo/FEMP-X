package unverified;

public class ClonePair9672 {

    int method1(int[] list){
      int max=0;
      if (list.length > 0) {
        max=list[0];
        for (int i=0; i < list.length; i++) {
          if (max < list[i])       max=list[i];
        }
      }
      return max;
    }

    int method2(int[] vec){
      if (vec.length != 0) {
        int max=vec[0];
        for (int i=0; i < vec.length; i++)     if (vec[i] > max)     max=vec[i];
        return max;
      }
      return 0;
    }
}
