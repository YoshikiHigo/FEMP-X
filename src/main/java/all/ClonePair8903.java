package all;

public class ClonePair8903 {

    byte[] method1(byte[] file,int start,int end){
      byte[] newFile=new byte[end - start + 1];
      for (int i=0; i < newFile.length; i++) {
        newFile[i]=file[start + i];
      }
      return newFile;
    }

    byte[] method2(byte[] data,int first,int last){
      byte[] temp=new byte[last + 1 - first];
      for (int i=first; i < last + 1; i++)   temp[i - first]=data[i];
      return temp;
    }
}
