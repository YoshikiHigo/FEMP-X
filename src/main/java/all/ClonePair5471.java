package all;

public class ClonePair5471 {

    int[] method1(int[] a,int size){
      if (a.length == size) {
        return a;
      }
     else {
        int[] b=new int[size];
        System.arraycopy(a,0,b,0,size);
        return b;
      }
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
