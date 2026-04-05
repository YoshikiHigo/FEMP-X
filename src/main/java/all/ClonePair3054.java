package all;

public class ClonePair3054 {

    int method1(Object arg0,Object arg1){
      String s1=(String)arg0;
      String s2=(String)arg1;
      int l1=0, l2=0;
      for (int i=s1.length() - 1; i >= 0; i--) {
        if (s1.charAt(i) == '.')     l1++;
      }
      for (int i=s2.length() - 1; i >= 0; i--) {
        if (s2.charAt(i) == '.')     l2++;
      }
      return l1 < l2 ? -1 : (l2 < l1 ? 1 : s1.compareTo(s2));
    }

    int method2(Object o1,Object o2){
      String s1=(String)o1;
      String s2=(String)o2;
      boolean isS1Class=s1.indexOf('.') != -1;
      boolean isS2Class=s2.indexOf('.') != -1;
      if ((isS1Class && isS2Class) || (!isS1Class && !isS2Class)) {
        return s1.compareTo(s2);
      }
     else {
        return isS1Class ? 1 : -1;
      }
    }
}
