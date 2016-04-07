package PracticalUseMVC;

/**
 * Created by User on 17.03.2016.
 */
public class Model {
    private int value1, value2;

    // The Program logic

    /**
     * in this method add valueInt with this.value
     * @param valueInt1, valueInt2
     * @return sum
     */
    public int addTwoValues(int valueInt1, int valueInt2){
        return  valueInt1 + valueInt2;
    }

    public int getValue1() {
        return value1;
    }
    public int getValue2() {
        return value2;
    }

    public void setValue1(int value1) {
        this.value1 = value1;

    }
    public void setValue2( int value2) {


    this.value2 = value2;}

}
