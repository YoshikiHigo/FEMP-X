package all;

public class ClonePair11016 {

    byte[] method1(byte data[],int start,int end){
      byte buf[]=new byte[end - start];
      for (int i=start; i < end; i++) {
        buf[i - start]=data[i];
      }
      return buf;
    }

    byte[] method2(byte tab[],int start,int end){
      byte tabTo[]=new byte[end - start];
      for (int i=start; i < end; i++) {
        tabTo[i]=tab[i];
      }
      return tabTo;
    }
}
