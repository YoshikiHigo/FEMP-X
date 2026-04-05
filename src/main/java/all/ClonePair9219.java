package all;

public class ClonePair9219 {

    char[] method1(byte[] tBytes,int nLength){
      char[] tChars=new char[nLength];
      for (int n=0; n < nLength; n++) {
        tChars[n]=(char)tBytes[n];
      }
      return tChars;
    }

    char[] method2(byte[] a,int newLength){
      char[] result=new char[newLength];
      for (int i=0; i < newLength; i++)   result[i]=(char)a[i];
      return result;
    }
}
