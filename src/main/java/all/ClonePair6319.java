package all;

public class ClonePair6319 {

    int method1(int[] stateVector,int[] completeVector){
      int index=0;
      int acumulador=1;
      for (int i=stateVector.length - 1; i >= 0; i--) {
        index+=completeVector[i] * acumulador;
        acumulador*=stateVector[i];
      }
      return index;
    }

    int method2(int[] dims,int[] pos){
      int offset=0;
      for (int i=0; i < dims.length; i+=1) {
        if (i > 0) {
          offset*=dims[i];
        }
        offset+=pos[i];
      }
      return offset;
    }
}
