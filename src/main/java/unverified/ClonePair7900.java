package unverified;

public class ClonePair7900 {

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

    char[] method2(char[] source,int index){
      if (index > source.length)   System.err.println("index out of bound error!!");
      char[] result=new char[source.length - index];
      for (int i=index; i < source.length; i++)   result[i - index]=source[i];
      return result;
    }
}
