package all;

public class ClonePair3947 {

    int method1(byte[] array,byte[] elem){
      int arrayLen=array.length;
      int elemLen=elem.length;
      if (elemLen > arrayLen)   return -1;
      int searchLen=arrayLen - elemLen;
      for (int i=0; i < searchLen; i++) {
        int counter=0;
        for (int j=0; j < elemLen; j++, counter++)     if (array[i + j] != elem[j])     break;
        if (counter == elemLen)     return i;
      }
      return -1;
    }

    int method2(byte[] blob,byte[] target){
      final int lengthDifference=blob.length - target.length;
      outer:   for (int idx=0; idx < lengthDifference; idx++) {
        for (int i=0; i < target.length; i++) {
          if (blob[idx + i] != target[i])       continue outer;
        }
        return idx;
      }
      return -1;
    }
}
