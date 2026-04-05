package all;

public class ClonePair4110 {

    boolean method1(String[] termos1,String[] termos2){
      if (termos1.length != termos2.length) {
        return false;
      }
      for (int i=0; i < termos1.length; i++) {
        if (!termos1[i].equals(termos2[i])) {
          return false;
        }
      }
      return true;
    }

    boolean method2(String[] s1,String[] s2){
      boolean equal=true;
      int index=0;
      if (s1.length == s2.length) {
        while ((index < s1.length) && (equal)) {
          if (s1[index].equals(s2[index])) {
            index++;
          }
     else {
            equal=false;
          }
        }
        if (index == s1.length)     return true;
     else     return false;
      }
     else {
        return false;
      }
    }
}
