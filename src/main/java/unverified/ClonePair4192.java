package unverified;

public class ClonePair4192 {

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

    boolean method2(String s1,String s2){
      if (s1.length() == s2.length()) {
        final char c1[]=s1.toCharArray();
        final char c2[]=s2.toCharArray();
        int n=s1.length();
        while (--n >= 0) {
          if (c1[n] != c2[n]) {
            return false;
          }
        }
      }
     else {
        return false;
      }
      return true;
    }
}
