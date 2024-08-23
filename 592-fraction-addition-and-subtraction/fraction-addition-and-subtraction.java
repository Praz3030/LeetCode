class Solution {
    public String fractionAddition(String expression) {
        
        int numerator = 0;
        int denominator = 1;

        String[] fractions = expression.replace("-", " -").replace("+", " +").split(" ");

        for (String fraction : fractions) {
            if (!fraction.isEmpty()) {
                String[] parts = fraction.split("/");
                int newNumerator = Integer.parseInt(parts[0]);
                int newDenominator = Integer.parseInt(parts[1]);

                numerator = numerator * newDenominator + newNumerator * denominator;
                denominator *= newDenominator;

                int gcd = gcd(Math.abs(numerator), denominator);
                numerator /= gcd;
                denominator /= gcd;
            }
        }

        return numerator + "/" + denominator;
    }

    private int gcd(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }
}