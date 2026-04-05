package unverified;

public class ClonePair5383 {

    int[] method1(int[] vals,int idx){
      int[] newVals=new int[vals.length - 1];
      if (idx > 0) {
        System.arraycopy(vals,0,newVals,0,idx);
      }
      if (idx < newVals.length) {
        System.arraycopy(vals,idx + 1,newVals,idx,newVals.length - idx);
      }
      return newVals;
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
