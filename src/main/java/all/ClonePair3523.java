package all;

public class ClonePair3523 {

    boolean method1(int[] indices,int[] dimensions){
      for (int indexPtr=indices.length - 1; indexPtr >= 0; indexPtr--) {
        if (indices[indexPtr] < dimensions[indexPtr] - 1) {
          indices[indexPtr]+=1;
          return true;
        }
     else {
          indices[indexPtr]=0;
        }
      }
      return false;
    }

    boolean method2(int[] coords,int[] sizes){
      int i;
      for (i=coords.length - 1; ; i--) {
        if (coords[i] + 1 >= sizes[i]) {
          if (i == 0)       return false;
          coords[i]=0;
        }
     else {
          coords[i]++;
          return true;
        }
      }
    }
}
