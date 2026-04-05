package all;

public class ClonePair3019 {

    int method1(Object o1,Object o2){
      String str1=(String)o1;
      String str2=(String)o2;
      if (str1 == null) {
        if (str2 == null)     return 0;
        return -1;
      }
     else   if (str2 == null) {
        return 1;
      }
      return str1.toLowerCase().compareTo(str2.toLowerCase());
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
