package all;

public class ClonePair4175 {

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

    boolean method2(String a,String b){
      if (a == b)   return true;
      String aw=a.split(" ",1)[0];
      String bw=b.split(" ",1)[0];
      return aw.compareTo(bw) == 0;
    }
}
