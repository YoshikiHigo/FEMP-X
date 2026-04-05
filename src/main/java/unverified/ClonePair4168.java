package unverified;

public class ClonePair4168 {

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
      s1=s1.trim() + " ";
      s2=s2.trim();
      if (s1.length() < s2.length())   return false;
      if (s2.length() == s1.length())   return s1.equals(s2);
      String[] w2=s2.split(" ");
      int pos=0;
      if (!s1.startsWith(w2[0] + " ")) {
        pos=s1.indexOf(" " + w2[0] + " ");
        if (pos == -1)     return false;
      }
      int k=1;
      while (k < w2.length) {
        String key=" " + w2[k] + " ";
        pos=s1.indexOf(key,pos + 1);
        if (pos == -1)     return false;
        k++;
      }
      return true;
    }
}
