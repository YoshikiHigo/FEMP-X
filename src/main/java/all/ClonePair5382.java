package all;

public class ClonePair5382 {

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
      int newLength=array.length - 1;
      int[] newArray=new int[newLength];
      System.arraycopy(array,0,newArray,0,index);
      if (index < newLength) {
        System.arraycopy(array,index + 1,newArray,index,newLength - index);
      }
      return newArray;
    }
}
