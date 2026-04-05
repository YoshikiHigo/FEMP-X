package all;

public class ClonePair10402 {

    boolean method1(char sectionType){
    switch (Character.toLowerCase(sectionType)) {
    case ' ':case 'r':case 'e':case 'c':case 'u':case 's':case 'd':{
          return true;
        }
    default:{
        return false;
      }
    }
    }

    boolean method2(char x){
      boolean b=true;
    switch (x) {
    case '1':case '2':case '3':case '4':case '5':case '6':case '7':case '8':case '9':case '0':    b=false;
      break;
    default:b=true;
    }
    return b;
    }
}
