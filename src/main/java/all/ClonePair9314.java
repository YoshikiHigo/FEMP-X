package all;

public class ClonePair9314 {

    String method1(char[] array,int start,int len){
      int idx1=start;
      int idx2=start + len - 1;
      while ((idx1 <= idx2) && (!Character.isLetterOrDigit(array[idx1]))) {
        idx1++;
      }
      while ((idx1 <= idx2) && (!Character.isLetterOrDigit(array[idx2]))) {
        idx2--;
      }
      return new String(array,idx1,idx2 - idx1 + 1);
    }

    String method2(char[] array,int start,int len){
      int idx1=start;
      int idx2=start + len - 1;
      while ((idx1 <= idx2) && (!Character.isLetterOrDigit(array[idx1])))   idx1++;
      while ((idx1 <= idx2) && (!Character.isLetterOrDigit(array[idx2])))   idx2--;
      return new String(array,idx1,idx2 - idx1 + 1);
    }
}
