package all;

public class ClonePair3936 {

    int method1(byte[] o1,byte[] o2){
      for (int i=0; i < o1.length && i < o2.length; i++) {
        int b1=0xFF & o1[i];
        int b2=0xFF & o2[i];
        if (b1 < b2)     return -1;
     else     if (b1 > b2)     return 1;
      }
      if (o1.length < o2.length)   return -1;
     else   if (o1.length > o2.length)   return 1;
     else   return 0;
    }

    int method2(byte[] thisKey,byte[] otherKey){
      int len=Math.min(thisKey.length,otherKey.length);
      for (int i=0; i < len; i++) {
        if (thisKey[i] >= 0) {
          if (otherKey[i] >= 0) {
            if (thisKey[i] < otherKey[i]) {
              return -1;
            }
     else         if (thisKey[i] > otherKey[i]) {
              return 1;
            }
          }
     else {
            return -1;
          }
        }
     else {
          if (otherKey[i] >= 0) {
            return 1;
          }
     else {
            if (thisKey[i] < otherKey[i]) {
              return -1;
            }
     else         if (thisKey[i] > otherKey[i]) {
              return 1;
            }
          }
        }
      }
      if (thisKey.length == otherKey.length) {
        return 0;
      }
      if (thisKey.length < otherKey.length) {
        return -1;
      }
      return 1;
    }
}
