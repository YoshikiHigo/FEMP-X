package all;

public class ClonePair3511 {

    int method1(int needle,int[] stack,int maxLen){
      for (int i=0; i < maxLen; i++) {
        if (stack[i] == needle) {
          return i;
        }
      }
      return -1;
    }

    int method2(int item,int[] list,int len){
      int i;
      for (i=0; i < len; i++) {
        if (list[i] == item)     return (i);
      }
      return (-1);
    }
}
