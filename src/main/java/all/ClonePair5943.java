package all;

public class ClonePair5943 {

    String[] method1(int from,int to,int step){
      int l=((to - from) / step) + 1;
      String[] s=new String[l];
      for (int i=0; i < l; i++) {
        s[i]="" + (from + i * step);
      }
      return s;
    }

    String[] method2(int start,int end,int step){
      int elementCount=((end - start) / step) + 1;
      start=start - step;
      String[] elements=new String[elementCount];
      for (int i=0; i < elements.length; i++) {
        elements[i]=String.valueOf(start+=step);
      }
      return elements;
    }
}
