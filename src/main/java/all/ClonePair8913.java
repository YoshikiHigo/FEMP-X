package all;

public class ClonePair8913 {

    byte[] method1(byte[] b,int count){
      if (count < b.length) {
        byte[] r=new byte[count];
        int begin=b.length - count;
        for (int i=b.length - count; i < b.length; i++)     r[i - begin]=b[i];
        return r;
      }
     else   if (count == b.length) {
        return b;
      }
     else   return null;
    }

    byte[] method2(byte[] b,int count){
      if (count < b.length) {
        byte[] r=new byte[count];
        for (int i=0; i < count; i++)     r[i]=b[i];
        return r;
      }
     else   if (count == b.length) {
        return b;
      }
     else   return null;
    }
}
