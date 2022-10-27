package mvp;

import java.util.Scanner;

public class MultiplicationProgram {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        MulModel mulModel = new MulModel();
        View view = new ViewImpl(scn, System.out);
        Presenter presenter = new Presenter(mulModel, view);
        presenter.execute();
    }
}
