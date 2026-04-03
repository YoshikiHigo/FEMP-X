package inequivalent;

public class ClonePair4406 {

    boolean method1(char[] testChar_) {
        if (testChar_.length != 3) return false;
        return (testChar_[0] == '-') && (testChar_[1] == '-') && (testChar_[1] == '>');
    }

    boolean method2(char[] testChar_) {
        if (testChar_.length != 4) return false;
        return (testChar_[0] == '<') && (testChar_[1] == '!') && (testChar_[1] == '-') && (testChar_[1] == '-');
    }
}
