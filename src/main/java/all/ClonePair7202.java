package all;

public class ClonePair7202 {

    long method1(int ndim,int elementCount,int[] shape){
      long length=elementCount;
      for (int i=0; i < ndim; i++) {
        length*=shape[i];
      }
      return length;
    }

    long method2(int ndim,int elementCount,int[] lengths){
      long arrayLength=elementCount;
      for (int i=0; i < ndim; i++)   arrayLength*=lengths[i];
      return arrayLength;
    }
}
