package all;

public class ClonePair12595 {

    boolean method1(int current,int from,int to){
      if (from < to) {
        return current >= from && current <= to;
      }
      return current <= from && current >= to;
    }

    boolean method2(int x,int x1,int x2){
      if (x1 > x2) {
        return x1 >= x && x >= x2;
      }
     else {
        return x1 <= x && x <= x2;
      }
    }
}
