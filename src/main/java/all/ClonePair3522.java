package all;

public class ClonePair3522 {

    int method1(Short s1,Short s2){
      if (s1 == null) {
        return s2 == null ? 0 : -1;
      }
     else   if (s2 == null) {
        return 1;
      }
      return s1.shortValue() < s2.shortValue() ? -1 : s1.shortValue() > s2.shortValue() ? 1 : 0;
    }

    int method2(Short o1,Short o2){
      if (o1 == o2)   return 0;
      if (o1 == null)   return -1;
      if (o2 == null)   return 1;
      if (o1.shortValue() < o2.shortValue())   return -1;
      if (o1.shortValue() > o2.shortValue())   return 1;
      return 0;
    }
}
