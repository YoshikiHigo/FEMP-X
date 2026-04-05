package all;

public class ClonePair6789 {

    int method1(int array[],int begin,int end){
      int best=begin;
      ++begin;
      while (begin < end) {
        if (array[best] < array[begin])     best=begin;
        ++begin;
      }
      return best;
    }

    int method2(int array[],int min,int max){
      int index=min;
      for (int i=min + 1; i <= max; ++i)   if (array[i] > array[index])   index=i;
      return index;
    }
}
