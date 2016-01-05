/**
 * Class realising calculator
 */

public class Calculator {

    /**
     * Result of calculating
     */
    private double result;

    /**
     * Sum arguments
     *
     * @param params is arguments of summing
     */
    public void add(int... params) {
        for (Integer param : params) {
            this.result += param;
        }
    }

    /**
     * Difference of arguments
     */
    public void diff(int... params) {
        this.result = this.result - (params[0] - params[1]);
    }

    /**
     * Division of arguments
     */
    public void div(int... params) {
        if (result != 0)
            this.result = this.result / params[0] / params[1];
        else
            this.result = params[0] / params[1];
    }

    /**
     * Multiplication
     */
    public void multi(int... params) {
        if (result != 0)
            this.result = this.result * params[0] * params[1];
        else
            this.result = params[0] * params[1];
    }

    /**
     * Exponentiation
     */
    public void pow(int param1, int param2) {
        result = param2;
        for (int i = 1; i < param1; i++) {
            result *= param2;
        }
    }

    /**
     * Get result
     *
     * @return is result of computing
     */
    public double getResult() {
        return this.result;
    }

    /**
     * Clear computing result
     */
    public void cleanResult() {
        System.out.println("Result is clean!");
        this.result = 0;
    }
}