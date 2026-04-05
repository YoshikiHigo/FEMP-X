package all;

public class ClonePair10844 {

    byte[] method1(byte[] source,byte[] original,byte[] replacement){
      byte[] ret=new byte[source.length];
      int I=0, J=0, d=replacement.length - original.length;
      for (; I < source.length; I++) {
        if (source[I] == original[0]) {
          boolean f=true;
          for (int i=1, II=I + 1; i < original.length; ) {
            if (source[II++] != original[i++]) {
              f=false;
              break;
            }
          }
          if (f) {
            if (d != 0) {
              byte[] t=new byte[ret.length + d];
              System.arraycopy(ret,0,t,0,((d < 0) ? t.length : ret.length));
              ret=t;
            }
            for (int i=0; i < replacement.length; i++)         ret[J++]=replacement[i];
            I+=original.length - 1;
          }
     else       ret[J++]=source[I];
        }
     else     ret[J++]=source[I];
      }
      return ret;
    }

    byte[] method2(byte[] source,byte[] original,byte[] replacement){
      byte[] ret=new byte[source.length];
      int I=0;
      int J=0;
      int d=replacement.length - original.length;
      for (; I < source.length; I++) {
        if (source[I] == original[0]) {
          boolean f=true;
          for (int i=1, II=I + 1; i < original.length; ) {
            if (source[II++] != original[i++]) {
              f=false;
              break;
            }
          }
          if (f) {
            if (d != 0) {
              byte[] t=new byte[ret.length + d];
              System.arraycopy(ret,0,t,0,((d < 0) ? t.length : ret.length));
              ret=t;
            }
            for (int i=0; i < replacement.length; i++) {
              ret[J++]=replacement[i];
            }
            I+=original.length - 1;
          }
     else {
            ret[J++]=source[I];
          }
        }
     else {
          ret[J++]=source[I];
        }
      }
      return ret;
    }
}
