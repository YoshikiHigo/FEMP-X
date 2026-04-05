package all;

public class ClonePair8919 {

    int method1(int[] array,int start,int end){
      int left=start;
      int right=end;
      int pivot=start;
      int pivot_key=array[pivot];
      while (true) {
        while (array[right] > pivot_key)     right--;
        while (array[left] < pivot_key)     left++;
        if (left < right) {
          int temp=array[left];
          array[left]=array[right];
          array[right]=temp;
        }
     else {
          return right;
        }
      }
    }

    int method2(int[] vetor,int ini,int fim){
      int aux, c=vetor[ini], i=ini + 1, j=fim;
      while (i <= j) {
        if (vetor[i] <= c)     ++i;
     else     if (c < vetor[j])     --j;
     else {
          aux=vetor[i];
          vetor[i]=vetor[j];
          vetor[j]=aux;
          ++i;
          --j;
        }
      }
      aux=vetor[ini];
      vetor[ini]=vetor[j];
      vetor[j]=aux;
      return j;
    }
}
