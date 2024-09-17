package stepsladders;

import java.util.Random;

public class SlSpinner
{
    Random generator = new Random();

    public int spin() { return 1 + this.generator.nextInt(6); }
}