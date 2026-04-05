package all;

public class ClonePair12843 {

    String method1(byte seq[],int start,int length,char planes[][]){
      StringBuffer buf=new StringBuffer();
      int end=start + length;
      int currentPlane=0;
      for (int k=start; k < end; ++k) {
        int one=(int)seq[k] & 0xff;
        char plane[]=planes[currentPlane];
        int cid=plane[one];
        if ((cid & 0x8000) == 0) {
          buf.append((char)cid);
          currentPlane=0;
        }
     else     currentPlane=cid & 0x7fff;
      }
      return buf.toString();
    }

    String method2(byte seq[],int start,int length,char planes[][]){
      StringBuffer buf=new StringBuffer();
      int end=start + length;
      int currentPlane=0;
      for (int k=start; k < end; ++k) {
        int one=seq[k] & 0xff;
        char plane[]=planes[currentPlane];
        int cid=plane[one];
        if ((cid & 0x8000) == 0) {
          buf.append((char)cid);
          currentPlane=0;
        }
     else     currentPlane=cid & 0x7fff;
      }
      return buf.toString();
    }
}
