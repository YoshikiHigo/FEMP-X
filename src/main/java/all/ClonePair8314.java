package all;

public class ClonePair8314 {

    int method1(byte[] a1,int from1,byte[] a2,int from2,int count){
      for (int i=0; i < count; i++) {
        final Byte b1=Byte.valueOf(a1[from1 + i]);
        final Byte b2=Byte.valueOf(a2[from2 + i]);
        final int c=b1.compareTo(b2);
        if (0 != c)     return c;
      }
      return 0;
    }

    int method2(byte[] left,int leftPos,byte[] right,int rightPos,int max){
      int maxLeft=leftPos + max;
      int maxRight=rightPos + max;
      int i=leftPos;
      int j=rightPos;
      int comp=0;
      while (comp == 0 && i < maxLeft && j < maxRight)   comp=left[i++] - right[j++];
      return comp;
    }
}
