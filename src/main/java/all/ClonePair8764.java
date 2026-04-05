package all;

public class ClonePair8764 {

    boolean method1(byte[] a,int aOff,int aLen,byte[] b,int bOff,int bLen){
      if ((aLen != bLen) || (a.length < aOff + aLen) || (b.length < bOff + bLen)) {
        return false;
      }
      for (int i=0; i < aLen; i++) {
        if (a[i + aOff] != b[i + bOff]) {
          return false;
        }
      }
      return true;
    }

    boolean method2(byte[] array1,int ind1,int len1,byte[] array2,int ind2,int len2){
      if ((array1.length - ind1 < len1) || (array2.length - ind2 < len2))   return false;
      if (len1 != len2)   return false;
      for (int i=0; i < len1; i++)   if (array1[ind1 + i] != array2[ind2 + i])   return false;
      return true;
    }
}
