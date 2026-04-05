package all;

public class ClonePair6095 {

    int method1(int a_index,int a_index2){
      if (a_index == -1) {
        return a_index2;
      }
      if (a_index2 == -1) {
        return a_index;
      }
      return Math.max(a_index,a_index2);
    }

    int method2(int a,int b){
      while (a != b) {
        if (a > b) {
          a=a - b;
        }
     else {
          b=b - a;
        }
      }
      return a;
    }
}
