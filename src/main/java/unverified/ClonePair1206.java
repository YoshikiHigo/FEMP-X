package unverified;

public class ClonePair1206 {

    boolean method1(byte[] o1,byte[] o2){
      if (o1.length != o2.length) {
        return false;
      }
     else {
        for (int i=0; i < o1.length; i++) {
          if (o1[i] != o2[i]) {
            return false;
          }
        }
        return true;
      }
    }

    boolean method2(byte[] name1,byte[] name2){
      if (name1.length != name2.length)   return false;
      if (name1 == name2)   return true;
      for (int i=name1.length; --i >= 0; )   if (name1[i] != name2[i])   return false;
      return true;
    }
}
