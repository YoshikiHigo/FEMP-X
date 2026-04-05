package unverified;

public class ClonePair5300 {

    int method1(char[] cToken,int start){
      while (start < cToken.length && Character.isWhitespace(cToken[start]))   ++start;
      return start;
    }

    int method2(char[] arr,int index){
      boolean cont;
      do {
        if (index >= arr.length) {
          return index;
        }
        cont=false;
    switch (arr[index]) {
    case '\t':case '\n':case '\r':case '\f':case ' ':{
            cont=true;
            index++;
          }
      }
    }
     while (cont);
    return index;
    }
}
