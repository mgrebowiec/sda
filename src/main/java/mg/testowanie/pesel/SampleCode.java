package mg.testowanie.pesel;

public class SampleCode {

    public String doSomething(int number, boolean flag) {
        if (number < 0) {
            return "ujemne";
        } else if (number > 0) {
            if (flag) {
                return "dodatnie";
            } else {
                return "dodatnie wylaczone";
            }
        }

        return "";
    }

}
