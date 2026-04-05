package all;

public class ClonePair6781 {

    int method1(int x2,int x1,int p){
      int d=x2 - x1;
      if (Math.abs(d) < p)   return x2;
      if (d < 0)   return x1 - p;
      if (d > 0)   return x1 + p;
      return x2;
    }

    int method2(int target,int number,int amount){
      int ret=number;
      if (number < target) {
        ret=number + amount;
        if (ret > target) {
          return target;
        }
     else {
          return ret;
        }
      }
     else   if (number > target) {
        ret=number - amount;
        if (ret < target) {
          return target;
        }
     else {
          return ret;
        }
      }
     else {
        return ret;
      }
    }
}
