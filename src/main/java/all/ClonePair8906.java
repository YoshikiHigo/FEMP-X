package all;

public class ClonePair8906 {

    byte[] method1(byte[] input,int length){
      byte[] output=new byte[length];
      int min=(input.length < length) ? input.length : length;
      for (int i=0; i < min; i++)   output[i]=input[i];
      for (int i=input.length; i < length; i++)   output[i]=(byte)0;
      return output;
    }

    byte[] method2(byte[] array,int bytes){
      byte[] result=new byte[bytes];
      if (array.length >= bytes)   System.arraycopy(array,array.length - bytes,result,0,bytes);
     else   System.arraycopy(array,0,result,bytes - array.length,array.length);
      return result;
    }
}
