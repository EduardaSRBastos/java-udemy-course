
public class TDArrays {
    public static void main(String[] args) {
        int[][] grades = {
            {72, 74, 78, 76},
            {65, 64, 61, 67},
            {95, 98, 99, 100}
        };
        System.out.println("\nGrades: ");
        for (int i = 0; i < grades.length; i++) {
            switch (i) {
                case 0: System.out.print("\tHarry: "); break; 
                case 1: System.out.print("\tRon: "); break;  
                case 2: System.out.print("\tHermione: "); break;   
            }

            for (int j = 0; j < grades[i].length; j++) {
                System.out.print(grades[i][j] + " ");
            }
            System.out.println("\n");
        }
        
        // System.out.println("\t Harry: " + Arrays.toString(grades[0]));
        // System.out.println("\t Ron: " + Arrays.toString(grades[1]));
        // System.out.println("\t Hermione: " + Arrays.toString(grades[2]));
    }
}
