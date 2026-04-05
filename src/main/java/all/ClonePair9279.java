package all;

public class ClonePair9279 {

    int method1(String packed,int offset,int[] result){
      int i=0;
      int j=offset;
      int l=packed.length();
      while (i < l) {
        int count=packed.charAt(i++);
        int value=packed.charAt(i++);
        do {
          result[j++]=value;
        }
     while (--count > 0);
      }
      return j;
    }

    int method2(String packed,int offset,int[] result){
      int i=0;
      int j=offset;
      int l=packed.length();
      while (i < l) {
        int count=packed.charAt(i++);
        int value=packed.charAt(i++);
        value--;
        do     result[j++]=value;
     while (--count > 0);
      }
      return j;
    }
}
