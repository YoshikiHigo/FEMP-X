package all;

public class ClonePair5301 {

    int method1(char[] cToken,int start){
      while (start < cToken.length && Character.isWhitespace(cToken[start]))   ++start;
      return start;
    }

    int method2(char[] array,int index){
      for (; index < array.length; ++index)   if (" \t\n\r".indexOf(array[index]) < 0)   break;
      return index;
    }
}
