package unverified;

public class ClonePair4184 {

    boolean method1(String one,String two){
      int index1=one.indexOf("[");
      int index2=two.indexOf("[");
      if (index1 > 0) {
        one=one.substring(0,index1);
      }
      if (index2 > 0) {
        two=two.substring(0,index2);
      }
      return one.equals(two);
    }

    boolean method2(String name1,String name2){
      int nameLen=name1.length();
      if (nameLen != name2.length()) {
        return false;
      }
      for (int i=nameLen - 1; i >= 0; i--) {
        char c1=name1.charAt(i);
        char c2=name2.charAt(i);
        if (c1 != c2) {
          if (c1 >= 'A' && c1 <= 'Z') {
            c1+=32;
          }
          if (c2 >= 'A' && c2 <= 'Z') {
            c2+=32;
          }
          if (c1 != c2) {
            return false;
          }
        }
      }
      return true;
    }
}
