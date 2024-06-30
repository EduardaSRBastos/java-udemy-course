public class HighScore {
    public static void main(String[] args) {
        
        int highScore = 0;
        int[] scores = {randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber()};

        // Instructions for this workbook are on Learn the Part (Workbook 6.5).
        System.out.print("\nHere are the scores: ");

        for (int score : scores) {
            System.out.print(score + " ");

            if (score > highScore) {
                highScore = score;
            }
        }


        System.out.println("\n\nThe highest score is: " + highScore + ".\nGive that man a cookie!");
        System.out.println();
    }  

    public static int randomNumber() {
        int randomNumber = (int)(Math.random() * 50_000);
        return randomNumber;
    }  

}
