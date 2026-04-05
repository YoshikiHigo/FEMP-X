package all;

public class ClonePair11346 {

    int method1(Integer val1,Integer val2){
      if (val1 == null && val2 == null)   return 0;
     else   if (val1 == null)   return 1;
     else   if (val2 == null)   return -1;
     else   if (val1 == val2)   return 0;
     else   if (val1 > val2)   return 1;
     else   if (val1 < val2)   return -1;
      return 0;
    }

    int method2(Integer o1,Integer o2){
      if (o1 == null) {
        return o2 == null ? 0 : 1;
      }
      if (o2 == null) {
        return -1;
      }
      if (o1.intValue() < o2.intValue()) {
        return -1;
      }
     else   if (o1.intValue() > o2.intValue()) {
        return 1;
      }
      return 0;
    }
}
