package all;

public class ClonePair7899 {

    char[] method1(char[] array,int apartir){
      int limite=array.length;
      char[] temp=new char[limite - apartir];
      int j=0;
      for (int i=apartir; i < limite; i++) {
        temp[j]=array[i];
        j++;
      }
      return temp;
    }

    char[] method2(char[] source,int count){
      char[] ret=new char[source.length - count];
      for (int i=0; i < ret.length; i++) {
        ret[i]=source[i + count];
      }
      return ret;
    }
}
