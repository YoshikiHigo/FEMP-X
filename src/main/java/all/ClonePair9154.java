package all;

public class ClonePair9154 {

    boolean method1(byte b){
    switch (b) {
    case ' ':case '\r':case '\n':case '\t':    return (true);
    }
    return (false);
    }

    boolean method2(byte byteToCheck){
    switch (byteToCheck) {
    case ' ':case '\n':case '\r':case '\t':    return true;
    default:  return false;
    }
    }
}
