package all;

public class ClonePair9319 {

    int method1(int[] vec){
      if (vec.length != 0) {
        int min=vec[0];
        for (int i=0; i < vec.length; i++)     if (vec[i] < min)     min=vec[i];
        return min;
      }
      return 0;
    }

    int method2(int[] list){
      int min=0;
      if (list.length > 0) {
        min=list[0];
        for (int i=0; i < list.length; i++) {
          if (min > list[i])       min=list[i];
        }
      }
      return min;
    }
}
