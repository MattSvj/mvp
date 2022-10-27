package mvp;

public class MulModel {

    private int first;

    private int second;

    public void setFirst(int first) {
        this.first = first;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getMul() {
        return first * second;
    }

    public static void main(String[] args) {
        MulModel mulModel = new MulModel();

        mulModel.setFirst(1);
        mulModel.setSecond(1);
        if (mulModel.getMul() != 1) {
            throw new AssertionError("Incorrect test result");
        }

        mulModel.setFirst(1);
        mulModel.setSecond(2);
        if (mulModel.getMul() != 2) {
            throw new AssertionError("Incorrect test result");
        }

        mulModel.setFirst(3);
        mulModel.setSecond(0);
        if (mulModel.getMul() != 0) {
            throw new AssertionError("Incorrect test result");
        }
    }
}