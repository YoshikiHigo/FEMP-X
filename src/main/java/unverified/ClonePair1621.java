package unverified;

public class ClonePair1621 {

    boolean method1(byte[] bytes1,byte[] bytes2){
      boolean result=(bytes1.length == bytes2.length);
      for (int i=0; i < bytes1.length && result; i++) {
        result=bytes1[i] == bytes2[i];
      }
      return result;
    }

    boolean method2(byte[] first,byte[] second){
      boolean equal=first.length == second.length;
      for (int i=0; i < first.length && equal; i++) {
        equal=first[i] == second[i];
      }
      return equal;
    }
}
