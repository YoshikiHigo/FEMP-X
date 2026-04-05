package all;

public class ClonePair5384 {

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

    int[] method2(int[] list,int length){
      int indx, location, temp;
      for (indx=1; indx < length; indx++) {
        if (list[indx] < list[indx - 1]) {
          temp=list[indx];
          location=indx;
          do {
            list[location]=list[location - 1];
            location--;
          }
     while (location > 0 && list[location - 1] > temp);
          list[location]=temp;
        }
      }
      return list;
    }
}
