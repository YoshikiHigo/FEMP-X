package unverified;

public class ClonePair4179 {

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

    boolean method2(String balise,String name){
      int length=balise.length();
      if (!balise.isEmpty() && balise.charAt(length - 1) == '*') {
        return name.startsWith(balise.substring(0,length - 1));
      }
     else {
        return name.equals(balise);
      }
    }
}
