public class Changer {

    public Changer() {

    }

    public String change(int arabNumber) {
        int m = arabNumber / 1000;
        arabNumber -= m * 1000;
        int c = arabNumber / 100;
        arabNumber -= c * 100;
        int x = arabNumber / 10;
        int i = arabNumber % 10;


        StringBuilder sb = new StringBuilder();

        sb.append(numberBuilder(m, "M", "", ""));
        sb.append(numberBuilder(c, "C", "D", "M"));
        sb.append(numberBuilder(x, "X", "L", "C"));
        sb.append(numberBuilder(i, "I", "V", "X"));

        return sb.toString();
    }

    private String numberBuilder(int i, String one, String five, String ten) {
        StringBuilder sb = new StringBuilder();

        if (i <= 3) {
            for (int j = 0; j < i; j++) {
                sb.append(one);
            }
        } else if (i == 4) {
            sb.append(one).append(five);
        } else if (i <= 8) { // nem kell beleirni, hogy legyen 5nel nagyobb, mert azokat mar lekezeltuk
            sb.append(five);
            for (int j = 6; j <= i ; j++) {
                sb.append(one);
            }
        } else { // nem kell beirni, hogy i = 9, mert felismeri, hogy 10-zel osztunk az elejen
            sb.append(one).append(ten);
        }
        return sb.toString();
    }
}
