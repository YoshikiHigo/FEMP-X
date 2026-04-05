package all;

public class ClonePair8783 {

    byte[] method1(byte[] src,int start,int end){
      final int cells=end - start + 1;
      byte[] n=new byte[cells];
      for (int x=0; x < cells; x++) {
        n[x]=src[x + start];
      }
      return n;
    }

    byte[] method2(byte[] file,int start,int end){
      byte[] newFile=new byte[end - start + 1];
      for (int i=0; i < newFile.length; i++) {
        newFile[i]=file[start + i];
      }
      return newFile;
    }
}
