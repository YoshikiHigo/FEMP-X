package all;

public class ClonePair9483 {

    boolean method1(int[] w){
      boolean sum=true;
      if (w[0] == 1) {
        for (int i=1; i < w.length; i++)     if (w[i] != -1)     return false;
      }
     else   if (w[0] == -1) {
        for (int i=1; i < w.length; i++)     if (w[i] != 1)     return false;
      }
     else   return false;
      return true;
    }

    boolean method2(int[] w){
      boolean sum=true;
      if (w[w.length - 1] == 1) {
        for (int i=0; i < w.length - 1; i++)     if (w[i] != -1)     return false;
      }
     else   if (w[w.length - 1] == -1) {
        for (int i=0; i < w.length - 1; i++)     if (w[i] != 1)     return false;
      }
     else   return false;
      return true;
    }
}
