import utility.Tester;

public class App {
    public static void main(String[] args) throws Exception {
        int input = 3;
        switch (input) {
            case 3:
                Tester.testProblem3();
                break;
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
