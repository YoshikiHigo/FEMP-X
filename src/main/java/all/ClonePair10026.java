package all;

public class ClonePair10026 {

    int method1(Long o1,Long o2){
      if (o1 == o2)   return 0;
      if (o1 == null)   return -1;
      if (o2 == null)   return 1;
      if (o1.longValue() < o2.longValue())   return -1;
      if (o1.longValue() > o2.longValue())   return 1;
      return 0;
    }

    int method2(Long l1,Long l2){
      if (l1 == null) {
        return l2 == null ? 0 : -1;
      }
     else   if (l2 == null) {
        return 1;
      }
      return l1.longValue() < l2.longValue() ? -1 : l1.longValue() > l2.longValue() ? 1 : 0;
    }
}
