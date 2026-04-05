package all;

public class ClonePair3956 {

    int method1(byte[] thisKey,byte[] otherKey){
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

    int method2(byte[] b1,byte[] b2){
      int len=Math.max(b1.length,b2.length);
      for (int i=0; i < len; ++i) {
        if (i == b1.length)     return i == b2.length ? 0 : -1;
     else     if (i == b2.length)     return 1;
     else     if ((0xff & (int)b1[i]) > (0xff & (int)b2[i]))     return 1;
     else     if ((0xff & (int)b1[i]) < (0xff & (int)b2[i]))     return -1;
      }
      return 0;
    }
}
