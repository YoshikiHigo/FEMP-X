package unverified;

public class ClonePair3526 {

    int method1(Object o1,Object o2){
      String s1=(String)o1;
      String s2=(String)o2;
      if (s1 == null) {
        return s2 == null ? 0 : -1;
      }
     else {
        return s2 == null ? 1 : s1.compareTo(s2);
      }
    }

    int method2(Object arg0,Object arg1){
      String aName=(String)arg0;
      String bName=(String)arg1;
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
