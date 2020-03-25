public class Main {

    public static void main(String[] args) {
        try {
            EncDecUtils encDecUtils = new EncDecUtils();
            encDecUtils.gradleTest();
            encDecUtils.serializeToJson();
        } catch (Exception e) {

        }
    }
}