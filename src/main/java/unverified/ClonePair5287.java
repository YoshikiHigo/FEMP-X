package unverified;

public class ClonePair5287 {

    int method1(char[] str,int pos){
      int len=str.length;
      while (pos < len && Character.isWhitespace(str[pos]))   pos++;
      return pos;
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
