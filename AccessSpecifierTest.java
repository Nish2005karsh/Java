class ClassOne {
    int defaultValue = 10;
    private int privateValue = 20;

    int getPrivateValue() {
        return privateValue;
    }
}

public class AccessSpecifierTest {
    public static void main(String[] args) {
        ClassOne obj = new ClassOne();

        System.out.println("Default value: " + obj.defaultValue);
        System.out.println("Private value using getter: " + obj.getPrivateValue());
    }
}