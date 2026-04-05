package unverified;

public class ClonePair7901 {

    char[] method1(char[] source,int count){
      char[] ret=new char[source.length - count];
      for (int i=0; i < ret.length; i++) {
        ret[i]=source[i + count];
      }
      return ret;
    }

    char[] method2(char[] source,int index){
      if (index > source.length)   System.err.println("index out of bound error!!");
      char[] result=new char[source.length - index];
      for (int i=index; i < source.length; i++)   result[i - index]=source[i];
      return result;
    }
}
