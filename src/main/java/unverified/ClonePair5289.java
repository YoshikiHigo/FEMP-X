package unverified;

public class ClonePair5289 {

    int method1(char[] str,int pos){
      int len=str.length;
      while (pos < len && Character.isWhitespace(str[pos]))   pos++;
      return pos;
    }

    int method2(char[] array,int index){
      for (; index < array.length; ++index)   if (" \t\n\r".indexOf(array[index]) < 0)   break;
      return index;
    }
}
