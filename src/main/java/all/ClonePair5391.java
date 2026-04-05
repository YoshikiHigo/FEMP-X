package all;

public class ClonePair5391 {

    int[] method1(int[] arr,int newSize){
      if (arr.length == newSize)   return arr;
      int[] newArr=new int[newSize];
      System.arraycopy(arr,0,newArr,0,newSize);
      return newArr;
    }

    int[] method2(int[] states,int newSize){
      if (states.length == newSize) {
        return states;
      }
      int[] trimmedStates=new int[newSize];
      System.arraycopy(states,0,trimmedStates,0,newSize);
      return trimmedStates;
    }
}
