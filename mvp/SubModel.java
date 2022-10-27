package mvp;

public class SubModel {

    private int first;

    private int second;

    public void setFirst(int first) {
        this.first = first;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getSub() {
        return first - second;
    }

    public static void main(String[] args) {
        SubModel subModel = new SubModel();

        subModel.setFirst(1);
        subModel.setSecond(1);
        if (subModel.getSub() != 0) {
            throw new AssertionError("Incorrect test result");
        }

        subModel.setFirst(1);
        subModel.setSecond(2);
        if (subModel.getSub() != -1) {
            throw new AssertionError("Incorrect test result");
        }

        subModel.setFirst(3);
        subModel.setSecond(1);
        if (subModel.getSub() != 2) {
            throw new AssertionError("Incorrect test result");
        }
    }
}