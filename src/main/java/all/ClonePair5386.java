package all;

public class ClonePair5386 {

    int[] method1(int[] array,int index){
      int newLength=array.length - 1;
      int[] newArray=new int[newLength];
      System.arraycopy(array,0,newArray,0,index);
      if (index < newLength) {
        System.arraycopy(array,index + 1,newArray,index,newLength - index);
      }
      return newArray;
    }

    int[] method2(int[] array,int index){
      int[] result=new int[array.length - 1];
      int newIndex=0;
      int oldIndex=0;
      while (oldIndex < array.length) {
        if (oldIndex == index) {
          oldIndex++;
        }
     else {
          result[newIndex]=array[oldIndex];
          newIndex++;
          oldIndex++;
        }
      }
      return result;
    }
}
