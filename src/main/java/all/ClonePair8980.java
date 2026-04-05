package all;

public class ClonePair8980 {

    int[] method1(int end,int[] r_size){
      int[] size=new int[end];
      int[] ids=new int[end];
      for (int ii=0; ii < end; ii++) {
        ids[ii]=ii;
        size[ii]=r_size[ii];
      }
      int i, j, k, start=0;
      int temp, id_temp;
      for (i=start + 1; i < end; i++) {
        temp=size[i];
        id_temp=ids[i];
        k=start;
        for (j=i - 1; j >= start; j--)     if (temp < size[j]) {
          size[j + 1]=size[j];
          ids[j + 1]=ids[j];
        }
     else {
          k=j + 1;
          break;
        }
        size[k]=temp;
        ids[k]=id_temp;
      }
      return ids;
    }

    int[] method2(int end,int[] line_x){
      int[] x=new int[end];
      int[] ids=new int[end];
      for (int ii=0; ii < end; ii++) {
        ids[ii]=ii;
        x[ii]=line_x[ii];
      }
      int i, j, k, start=0;
      int id_temp;
      int temp;
      for (i=start + 1; i < end; i++) {
        temp=x[i];
        id_temp=ids[i];
        k=start;
        for (j=i - 1; j >= start; j--)     if (temp < x[j]) {
          x[j + 1]=x[j];
          ids[j + 1]=ids[j];
        }
     else {
          k=j + 1;
          break;
        }
        x[k]=temp;
        ids[k]=id_temp;
      }
      return ids;
    }
}
