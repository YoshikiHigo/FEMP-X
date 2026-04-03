package equivalent;

public class ClonePair11606 {
    boolean method1(char testChar_) {
        return (testChar_ == '_') || ((testChar_ >= 'A') && (testChar_ <= 'Z')) || ((testChar_ >= 'a') && (testChar_ <= 'z')) || ((testChar_ >= '0') && (testChar_ <= '9'));
    }

    boolean method2(char ch) {
        return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9') || ch == '_';
    }
}
