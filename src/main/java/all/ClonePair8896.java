package all;

public class ClonePair8896 {

    byte[] method1(byte[] in,int to){
      if (null == in)   return null;
     else   if (in.length <= to)   return in;
     else {
        byte[] copier=new byte[to];
        System.arraycopy(in,0,copier,0,to);
        return copier;
      }
    }

    byte[] method2(byte[] data,int r){
      if (data != null && r < data.length) {
        byte[] b=new byte[r];
        System.arraycopy(data,0,b,0,r);
        return b;
      }
      return data;
    }
}
