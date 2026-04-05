package all;

public class ClonePair6779 {

    int method1(int n,int my,int child){
      if (my >= child || n < 0) {
        return 0;
      }
      if ((my + n) > child) {
        return child - my;
      }
      return n;
    }

    int method2(int n,int my,int child){
      if (my >= child || n < 0)   return 0;
      if ((my + n) > child)   return child - my;
      return n;
    }
}
