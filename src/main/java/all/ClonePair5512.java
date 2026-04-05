package all;

public class ClonePair5512 {

    int[] method1(int[] array,int minCapacity){
      int oldCapacity=array.length;
      int[] newArray;
      if (minCapacity > oldCapacity) {
        int newCapacity=(oldCapacity * 3) / 2 + 1;
        if (newCapacity < minCapacity) {
          newCapacity=minCapacity;
        }
        newArray=new int[newCapacity];
        System.arraycopy(array,0,newArray,0,oldCapacity);
      }
     else {
        newArray=array;
      }
      return newArray;
    }

    int[] method2(int[] array,int minCapacity){
      int oldCapacity=array.length;
      if (minCapacity > oldCapacity) {
        int[] oldData=array;
        int newCapacity=(oldCapacity * 3) / 2 + 1;
        if (newCapacity < minCapacity)     newCapacity=minCapacity;
        int[] copy=new int[newCapacity];
        System.arraycopy(array,0,copy,0,Math.min(oldData.length,newCapacity));
        return copy;
      }
      return array;
    }
}
