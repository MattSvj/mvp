package mvp;

import java.util.Scanner;

public class SubtractionProgram {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        SubModel subModel = new SubModel();
        View view = new ViewImpl(scn, System.out);
        Presenter presenter = new Presenter(subModel, view);
        presenter.execute();
    }
}
