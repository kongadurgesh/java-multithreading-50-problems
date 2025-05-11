import utility.Tester;

public class App {
    public static void main(String[] args) throws Exception {
        int input = 2;
        switch (input) {
            case 2:
                Tester.testProblem2();
                break;
            case 1:
                Tester.testProblem1();
                break;
            default:
                break;
        }
    }
}
