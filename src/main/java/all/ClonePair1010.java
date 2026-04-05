package all;

public class ClonePair1010 {

    boolean method1(byte[] a,byte[] b){
      if (a.length != b.length)   return false;
      for (int i=0; i < a.length; i++) {
        if (a[i] != b[i]) {
          return false;
        }
      }
      return true;
    }

    boolean method2(byte[] Hash_1,byte[] Hash_2){
      boolean Result;
      int j, jEnd;
      Result=(Hash_1.length == Hash_2.length);
      for (j=1, jEnd=Hash_1.length; Result && j <= jEnd; j++)   Result=(Hash_1[j - 1] == Hash_2[j - 1]);
      return Result;
    }
}
