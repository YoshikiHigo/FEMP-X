package all;

public class ClonePair3652 {

    int method1(Object o1,Object o2){
      String s1;
      String s2;
      if ((o1 == null) && (o2 == null))   return 0;
     else   if (o1 == null)   return -1;
     else   if (o2 == null)   return +1;
      s1=(String)o1;
      s2=(String)o2;
      return s1.toLowerCase().compareTo(s2.toLowerCase());
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
