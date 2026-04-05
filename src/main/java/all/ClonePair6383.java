package all;

public class ClonePair6383 {

    int method1(int[] i1,int[] i2){
      if (i1.length != i2.length)   return i1.length - i2.length;
      for (int i=0; i < i1.length; ++i)   if (i1[i] != i2[i])   return i1[i] - i2[i];
      return 0;
    }

    int method2(int[] oneArray,int[] anotherArray){
      if (oneArray.length != anotherArray.length) {
        return oneArray.length - anotherArray.length;
      }
      for (int index=0; index < oneArray.length; index++) {
        if (oneArray[index] != anotherArray[index]) {
          return oneArray[index] - anotherArray[index];
        }
      }
      return 0;
    }
}
