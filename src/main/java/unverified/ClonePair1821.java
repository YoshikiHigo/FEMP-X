package unverified;

public class ClonePair1821 {

    boolean method1(byte[] Hash_1,byte[] Hash_2){
      boolean Result;
      int j, jEnd;
      Result=(Hash_1.length == Hash_2.length);
      for (j=1, jEnd=Hash_1.length; Result && j <= jEnd; j++)   Result=(Hash_1[j - 1] == Hash_2[j - 1]);
      return Result;
    }

    boolean method2(byte[] b1,byte[] b2){
      if (b1.length != b2.length)   return false;
      for (int i=0; i < b1.length; i++)   if (b1[i] != b2[i])   return false;
      return true;
    }
}
