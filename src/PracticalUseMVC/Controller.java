package PracticalUseMVC;

import java.util.Scanner;

/**
 * Created by User on 17.03.2016.
 */
public class Controller {
    // The Constants
    public static final double PI = 3.14;

    // The Regex
    // «nick@mail.com»
    public static final String REGEX_MAIL = "^([a-z0-9_-]+\\.)*[a-z0-9_-]+@[a-z0-9_-]+(\\.[a-z0-9_-]+)*\\.[a-z]{2,6}$";
    // «http://www.my-site.com»
    public static final String REGEX_URL = "^((https?|ftp)\\:\\/\\/)?([a-z0-9]{1})((\\.[a-z0-9-])|([a-z0-9-]))*\\.([a-z]{2,6})(\\/?)$";
    // «+38(044)555-55-55»
    public static final String REGEX_PHONE = "^\\+\\d{2}\\(\\d{3}\\)\\d{3}-\\d{2}-\\d{2}$";

    // Constructor
    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    // The Work method
    public void processUser() {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        model.setValue1(inputFirstIntValueWithScanner(sc1));
        model.setValue2(inputSecondIntValueWithScanner(sc2));
      // model.addTwoValues(model.getValue1(), model.getValue2() );

        view.printMessageAndInt(view.OUR_INT,  model.addTwoValues(model.getValue1(), model.getValue2() ));
    }

    // The Utility methods
    public int inputFirstIntValueWithScanner(Scanner sc1) {

        view.printMessage(view.INPUT_FIRST_INT_DATA);
        while (!sc1.hasNextInt()) {
            view.printMessage(view.WRONG_INPUT_INT_DATA + view.INPUT_FIRST_INT_DATA);
            sc1.next();
        }
        return sc1.nextInt();
    }
    public int inputSecondIntValueWithScanner(Scanner sc2) {
        view.printMessage(view.INPUT_SECOND_INT_DATA);
        while (!sc2.hasNextInt()) {
            view.printMessage(view.WRONG_INPUT_INT_DATA + view.INPUT_SECOND_INT_DATA);
            sc2.next();
        }

        return sc2.nextInt();
    }
}

