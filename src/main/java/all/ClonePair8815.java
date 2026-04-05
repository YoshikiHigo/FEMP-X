package all;

public class ClonePair8815 {

    byte[] method1(byte[] packet,int start,int stop){
      byte[] ret=new byte[stop - start + 1];
      for (int i=start; i <= stop; i++)   ret[i - start]=packet[i];
      return ret;
    }

    byte[] method2(byte[] file,int start,int end){
      byte[] newFile=new byte[end - start + 1];
      for (int i=0; i < newFile.length; i++) {
        newFile[i]=file[start + i];
      }
      return newFile;
    }
}
