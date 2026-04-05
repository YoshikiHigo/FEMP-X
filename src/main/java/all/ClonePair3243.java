package all;

public class ClonePair3243 {

    int method1(Object o1,Object o2){
      Comparable a=(Comparable)o1;
      Comparable b=(Comparable)o2;
      if (a == null && b == null) {
        return 0;
      }
     else   if (a == null) {
        return -1;
      }
     else   if (b == null) {
        return 1;
      }
     else {
        return a.compareTo(b);
      }
    }

    int method2(Object arg0,Object arg1){
      Integer aName=(Integer)arg0;
      Integer bName=(Integer)arg1;
      if ((aName == null) && (bName == null)) {
        return 0;
      }
      if ((aName != null) && (bName == null)) {
        return 1;
      }
      if ((aName == null) && (bName != null)) {
        return -1;
      }
      return aName.compareTo(bName);
    }
}
