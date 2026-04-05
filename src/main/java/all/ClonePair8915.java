package all;

public class ClonePair8915 {

    byte[] method1(byte[] array,int start){
      int len=array.length - start;
      byte[] buffer=new byte[len];
      for (int x=0; x < len; x++)   buffer[x]=array[start + x];
      return buffer;
    }

    byte[] method2(byte[] array,int prefixLength){
      int newLength=array.length - prefixLength;
      byte[] newArray=new byte[newLength];
      if (newLength == 0)   return newArray;
      System.arraycopy(array,prefixLength,newArray,0,newLength);
      return newArray;
    }
}
