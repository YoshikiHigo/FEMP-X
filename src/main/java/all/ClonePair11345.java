package all;

public class ClonePair11345 {

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

    int method2(Integer o1,Integer o2){
      if (o1 == o2)   return 0;
      if (o1 == null)   return -1;
      if (o2 == null)   return 1;
      if (o1.intValue() < o2.intValue())   return -1;
      if (o1.intValue() > o2.intValue())   return 1;
      return 0;
    }
}
