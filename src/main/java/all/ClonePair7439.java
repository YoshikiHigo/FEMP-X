package all;

public class ClonePair7439 {

    String method1(String string,int size,char character){
      if (size < 0) {
        return null;
      }
      if (size < string.length()) {
        return string;
      }
      char buf[]=new char[size];
      for (int i=0; i < size - string.length(); i++) {
        buf[i]=character;
      }
      System.arraycopy(string.toCharArray(),0,buf,size - string.length(),string.length());
      return new String(buf);
    }

    String method2(String string,int size,char character){
      if (size < 0) {
        return null;
      }
      if (size < string.length()) {
        return string;
      }
      char buf[]=new char[size];
      for (int i=size - string.length(); i < size; i++) {
        buf[i]=character;
      }
      System.arraycopy(string.toCharArray(),0,buf,0,string.length());
      return new String(buf);
    }
}
