import java.util.Arrays;

public class ReferenceTrap {
    public static void main(String[] args) {
        String[] staffLastYear = {"Tommy", "Joel", "Ellie"};
        //  String[] staffThisYear = staffLastYear;
        // String[] staffThisYear = new String[3];

        // for (int i = 0; i < staffThisYear.length; i++) {
        //     staffThisYear[i] = staffLastYear[i];
        // }

        String[] staffThisYear = Arrays.copyOf(staffLastYear, staffLastYear.length);

        staffThisYear[1] = "Abby";
        System.out.println();
        System.out.println(Arrays.toString(staffLastYear));
        System.out.println(Arrays.toString(staffThisYear));
        System.out.println();
    }
}
