package unverified;

public class ClonePair5385 {

    int[] method1(int[] pertinence,int taille){
      boolean change=true;
      int tmp;
      while (change) {
        change=false;
        for (int i=0; i < taille - 2; i++) {
          if (pertinence[i] < pertinence[i + 1]) {
            tmp=pertinence[i];
            pertinence[i]=pertinence[i + 1];
            pertinence[i + 1]=tmp;
            change=true;
          }
        }
      }
      return pertinence;
    }

    int[] method2(int[] a,int len){
      for (int i=0; i < len; i++) {
        for (int j=i + 1; j < len; j++) {
          if (a[i] > a[j]) {
            int tmp=a[i];
            a[i]=a[j];
            a[j]=tmp;
          }
        }
      }
      return a;
    }
}
