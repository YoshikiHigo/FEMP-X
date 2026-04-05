package all;

public class ClonePair9046 {

    int method1(int[] dest,int offset,int[] x,int len,int y){
      long yl=(long)y & 0xffffffffL;
      int carry=0;
      int j=0;
      do {
        long prod=((long)x[j] & 0xffffffffL) * yl;
        int prod_low=(int)prod;
        int prod_high=(int)(prod >> 32);
        prod_low+=carry;
        carry=((prod_low ^ 0x80000000) < (carry ^ 0x80000000) ? 1 : 0) + prod_high;
        int x_j=dest[offset + j];
        prod_low=x_j - prod_low;
        if ((prod_low ^ 0x80000000) > (x_j ^ 0x80000000))     carry++;
        dest[offset + j]=prod_low;
      }
     while (++j < len);
      return carry;
    }

    int method2(int[] dest,int offset,int[] x,int len,int y){
      long yl=y & 0xffffffffL;
      int carry=0;
      int j=0;
      do {
        long prod=(x[j] & 0xffffffffL) * yl;
        int prod_low=(int)prod;
        int prod_high=(int)(prod >> 32);
        prod_low+=carry;
        carry=((prod_low ^ 0x80000000) < (carry ^ 0x80000000) ? 1 : 0) + prod_high;
        int x_j=dest[offset + j];
        prod_low=x_j - prod_low;
        if ((prod_low ^ 0x80000000) > (x_j ^ 0x80000000))     carry++;
        dest[offset + j]=prod_low;
      }
     while (++j < len);
      return carry;
    }
}
