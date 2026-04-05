package all;

public class ClonePair5036 {

    int method1(int val,int limit){
      if (val > limit && limit != 0) {
        return limit;
      }
     else   if (val < 0) {
        return 0;
      }
      return val;
    }

    int method2(int val,int limit){
      if (val > limit && limit != 0)   return limit;
     else   if (val < 0)   return 0;
      return val;
    }
}
