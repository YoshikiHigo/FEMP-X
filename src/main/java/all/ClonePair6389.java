package all;

public class ClonePair6389 {

    int method1(int node1,int node2){
      if (node1 > node2) {
        return (int)(node2 + ((node1 - node2) / 2.0));
      }
     else {
        return (int)(node1 + ((node2 - node1) / 2.0));
      }
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
