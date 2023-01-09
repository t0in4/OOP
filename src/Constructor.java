public class Constructor {
    int x;
    int y;
    String x1;
    String y1;

    public Constructor(int x, int y, String x1, String y1) {
        this.x = x;
        this.y = y;
        this.x1 = x1;
        this.y1 = y1;
    }

    public int sum() {
        return this.x + this.y + Integer.parseInt(x1) + Integer.parseInt(y1);
    }


}
