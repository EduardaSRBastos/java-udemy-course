public class HighScore {
    public static void main(String[] args) {
        int[] scores = {randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber()};
        
        int highScore = 0;
        int seat = 0;
        System.out.print("\nHere are the scores: ");    
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + " ");
            if (scores[i] > highScore) {
                highScore = scores[i];
                seat = i;
            }
        }
        
       
        System.out.println("\n\nThe highest score is: " + highScore + ".\nImpressive!");
        
        // TODO : See instructions on Learn the Part (Workbook 6.6)

        System.out.println("\nIt's the gentleman in seat: " + seat + ".\nGive that man a cookie!");
        System.out.println();
    }
    
    public static int randomNumber() {
        double randomDouble = Math.random() * 50000;
        int randomInt = (int)randomDouble;
        return randomInt;
    }
}
