package all;

public class ClonePair1988 {

    String method1(byte[] d){
      if (d == null) {
        return null;
      }
      byte data[]=new byte[d.length + 2];
      System.arraycopy(d,0,data,0,d.length);
      byte dest[]=new byte[(data.length / 3) * 4];
      for (int sidx=0, didx=0; sidx < d.length; sidx+=3, didx+=4) {
        dest[didx]=(byte)((data[sidx] >>> 2) & 077);
        dest[didx + 1]=(byte)((data[sidx + 1] >>> 4) & 017 | (data[sidx] << 4) & 077);
        dest[didx + 2]=(byte)((data[sidx + 2] >>> 6) & 003 | (data[sidx + 1] << 2) & 077);
        dest[didx + 3]=(byte)(data[sidx + 2] & 077);
      }
      for (int idx=0; idx < dest.length; idx++) {
        if (dest[idx] < 26) {
          dest[idx]=(byte)(dest[idx] + 'A');
        }
     else     if (dest[idx] < 52) {
          dest[idx]=(byte)(dest[idx] + 'a' - 26);
        }
     else     if (dest[idx] < 62) {
          dest[idx]=(byte)(dest[idx] + '0' - 52);
        }
     else     if (dest[idx] < 63) {
          dest[idx]=(byte)'+';
        }
     else {
          dest[idx]=(byte)'/';
        }
      }
      for (int idx=dest.length - 1; idx > (d.length * 4) / 3; idx--) {
        dest[idx]=(byte)'=';
      }
      return new String(dest);
    }

    String method2(byte[] d){
      if (d == null)   return null;
      byte data[]=new byte[d.length + 2];
      System.arraycopy(d,0,data,0,d.length);
      byte dest[]=new byte[(data.length / 3) * 4];
      for (int sidx=0, didx=0; sidx < d.length; sidx+=3, didx+=4) {
        dest[didx]=(byte)((data[sidx] >>> 2) & 077);
        dest[didx + 1]=(byte)((data[sidx + 1] >>> 4) & 017 | (data[sidx] << 4) & 077);
        dest[didx + 2]=(byte)((data[sidx + 2] >>> 6) & 003 | (data[sidx + 1] << 2) & 077);
        dest[didx + 3]=(byte)(data[sidx + 2] & 077);
      }
      for (int idx=0; idx < dest.length; idx++) {
        if (dest[idx] < 26)     dest[idx]=(byte)(dest[idx] + 'A');
     else     if (dest[idx] < 52)     dest[idx]=(byte)(dest[idx] + 'a' - 26);
     else     if (dest[idx] < 62)     dest[idx]=(byte)(dest[idx] + '0' - 52);
     else     if (dest[idx] < 63)     dest[idx]=(byte)'+';
     else     dest[idx]=(byte)'/';
      }
      for (int idx=dest.length - 1; idx > (d.length * 4) / 3; idx--) {
        dest[idx]=(byte)'=';
      }
      return new String(dest);
    }
}
