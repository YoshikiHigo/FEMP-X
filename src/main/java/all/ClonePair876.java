package all;

public class ClonePair876 {

    boolean method1(byte[] one,byte[] two){
      if (one.length != two.length)   return false;
     else {
        for (int x=0; x < one.length; x++) {
          if (one[x] != two[x])       return false;
        }
      }
      return true;
    }

    boolean method2(byte[] first,byte[] second){
      boolean equal=first.length == second.length;
      for (int i=0; i < first.length && equal; i++) {
        equal=first[i] == second[i];
      }
      return equal;
    }
}
