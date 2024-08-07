class Solution {

    private final String[] Tens = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    private final String[] Twentys = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private final String[] Hundreds = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};


    public String numberToWords(int num) {
        if (num == 0) {
            return "Zero";
        }

        String ans = "";

        if (num >= 1000000000) {
            ans += numberToWords(num / 1000000000) + " Billion ";
            num %= 1000000000;
        }

        if (num >= 1000000) {
            ans += numberToWords(num / 1000000) + " Million ";
            num %= 1000000;
        }

        if (num >= 1000) {
            ans += numberToWords(num / 1000) + " Thousand ";
            num %= 1000;
        }

        if (num >= 100) {
            ans += Tens[num / 100] + " Hundred ";
            num %= 100;
        }

        if (num >= 20) {
            ans += Hundreds[num / 10] + " ";
            num %= 10;
        }

        if (num >= 10) {
            ans += Twentys[num - 10] + " ";
            num = 0;
        }

        if (num > 0) {
            ans += Tens[num] + " ";
        }

        return ans.trim();
    }
}