package unverified;

public class ClonePair10424 {

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

    boolean method2(char aCode){
      char testChar=Character.toLowerCase(aCode);
    switch (testChar) {
    case ' ':case 'r':case 'e':case 'c':case 'u':case 's':case 'd':    return true;
    }
    return false;
    }
}
