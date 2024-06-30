public class Beer {
    public static void main(String[] args) {
       // See detailed instructions on Learn the Part.
       System.out.println();
       for (int i = 99; i > 0; i--) {
            sing(i);
       }
       System.out.println();
    }

    public static void sing(int i) {
        System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer!");
        System.out.println("take one down, pass it around, " + (i--) + " bottles of beer on the wall!");
    }
}
