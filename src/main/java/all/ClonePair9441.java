package all;

public class ClonePair9441 {

    int method1(int[] vet){
      int max=vet[0];
      for (int i=1; i < vet.length; i++) {
        if (vet[i] > max) {
          max=vet[i];
        }
      }
      return (max);
    }

    int method2(int[] qianArray){
      int max=qianArray[0];
      for (int i=1; i < qianArray.length; i++) {
        if (max < qianArray[i]) {
          max=qianArray[i];
        }
      }
      return max;
    }
}
