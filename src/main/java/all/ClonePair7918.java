package all;

public class ClonePair7918 {

    int method1(String o1,String o2,boolean nullsFirst){
      if (o1 == o2) {
        return 0;
      }
     else   if (o1 == null) {
        return nullsFirst ? -1 : 1;
      }
     else   if (o2 == null) {
        return nullsFirst ? 1 : -1;
      }
     else {
        return o1.compareToIgnoreCase(o2);
      }
    }

    int method2(String s1,String s2,boolean nullIsFirst){
      if (s1 == null) {
        return (s2 == null) ? 0 : (nullIsFirst ? -1 : 1);
      }
     else   if (s2 == null) {
        return nullIsFirst ? 1 : -1;
      }
      return s1.compareTo(s2);
    }
}
