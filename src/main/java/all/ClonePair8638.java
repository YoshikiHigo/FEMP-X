package all;

public class ClonePair8638 {

    int method1(char[] buffer,int start,char c){
      for (int i=start; i < buffer.length; i++)   if (buffer[i] == c)   return i;
      return -1;
    }

    int method2(char[] data,int start,char c){
      for (int i=start; i < data.length; i++) {
        if (data[i] == c)     return i;
      }
      return (-1);
    }
}
