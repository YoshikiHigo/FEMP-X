package unverified;

public class ClonePair1833 {

    boolean method1(byte[] Hash_1,byte[] Hash_2){
      boolean Result;
      int j, jEnd;
      Result=(Hash_1.length == Hash_2.length);
      for (j=1, jEnd=Hash_1.length; Result && j <= jEnd; j++)   Result=(Hash_1[j - 1] == Hash_2[j - 1]);
      return Result;
    }

    boolean method2(byte[] tom,byte[] jerry){
      boolean b=true;
      if (tom.length != jerry.length) {
        b=false;
      }
     else {
        for (int i=0; i < tom.length; i++) {
          if (tom[i] != jerry[i]) {
            b=false;
            break;
          }
        }
      }
      return b;
    }
}
