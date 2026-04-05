package all;

public class ClonePair11344 {

    int method1(Integer sc1,Integer sc2){
      if (sc1 == null) {
        if (sc2 == null) {
          return 0;
        }
        return -1;
      }
      if (sc2 == null) {
        return +1;
      }
      if (sc1 > sc2)   return +1;
      if (sc1 < sc2)   return -1;
      return 0;
    }

    int method2(Integer i1,Integer i2){
      if (i1 == null) {
        return i2 == null ? 0 : -1;
      }
     else   if (i2 == null) {
        return 1;
      }
      return i1.intValue() < i2.intValue() ? -1 : i1.intValue() > i2.intValue() ? 1 : 0;
    }
}
