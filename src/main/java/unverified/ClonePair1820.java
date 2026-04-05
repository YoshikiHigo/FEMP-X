package unverified;

public class ClonePair1820 {

    boolean method1(byte[] Hash_1,byte[] Hash_2){
      boolean Result;
      int j, jEnd;
      Result=(Hash_1.length == Hash_2.length);
      for (j=1, jEnd=Hash_1.length; Result && j <= jEnd; j++)   Result=(Hash_1[j - 1] == Hash_2[j - 1]);
      return Result;
    }

    boolean method2(byte[] array1,byte[] array2){
      if (array1.length != array2.length) {
        return false;
      }
      int len=array1.length;
      for (int i=0; i < len; i++) {
        if (array1[i] != array2[i]) {
          return false;
        }
      }
      return true;
    }
}
