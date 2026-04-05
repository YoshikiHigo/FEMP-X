package all;

public class ClonePair5498 {

    int[] method1(int[] list,int length){
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
