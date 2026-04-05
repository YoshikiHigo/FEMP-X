package unverified;

public class ClonePair12601 {

    String method1(String s1,String s2){
      int i, l1, l2;
      l1=s1.length();
      l2=s2.length();
      for (i=0; i < l1 && i < l2; i++) {
        if (s1.charAt(i) != s2.charAt(i))     break;
      }
      return (s1.substring(0,i));
    }

    String method2(String e1,String e2){
      StringBuffer re=new StringBuffer();
      int e1Index=e1.length() - 1;
      int e2Index=e2.length() - 1;
      while (e1Index >= 0 && e2Index >= 0) {
        if (e1.charAt(e1Index) == e2.charAt(e2Index)) {
          re.insert(0,e1.charAt(e1Index));
        }
     else     break;
        e1Index--;
        e2Index--;
      }
      return re.toString();
    }
}
