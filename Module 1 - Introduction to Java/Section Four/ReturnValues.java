public class ReturnValues {
    public static void main(String[] args) {
        double area = calculateArea(2.3, 3.5);
        double area2 = calculateArea(1.6, 2.4);
        double area3 = calculateArea(2.6, 4.3);

        System.out.println("\nAreas:\n" + area +" m^2\n" + area2 +" m^2\n" + area3 +" m^2");
        System.out.println();
        printArea(2.3, 3.5, area);

        System.out.println();
        String englishExplanation = explainArea("English");
        String frenchExplanation = explainArea("French");
        String spanishExplanation = explainArea("Spanish");
        String portugueseExplanation = explainArea("Portuguese");

        System.out.println("Language Explanations:\n" + englishExplanation + "\n" + frenchExplanation + "\n" + spanishExplanation + "\n" + portugueseExplanation);
        System.out.println();
    }

    public static double calculateArea(double length, double width) {
        if (length < 0 || width < 0) {
            System.out.println("Invalid Dimensions!");
            System.exit(0);
        }
        double area = length * width;

        return area;
    }

    public static void printArea(double length, double width, double area) {
        System.out.println("A rectangle with a length of " + length + " and a width of " + width + " has an area of " + area);
    }

    public static String explainArea(String language) {
        switch (language) {
            case "English":
                return "Area equals length * width";
            case "French":
                return "La surface est egale a la longueur * la largeur";
            case "Spanish":
                return "area es igual a largo * ancho";
            default: 
                return "Language not available.";
        }
    }

}
