public class SubjectMarks {
    public static void main(String[] args) {
        // Check if exactly 5 arguments are passed through the command line
        if (args.length != 5) {
            System.out.println("Error: Please provide exactly 5 subject marks as command-line arguments.");
            System.out.println("Usage: java SubjectMarks <mark1> <mark2> <mark3> <mark4> <mark5>");
            return;
        }

        try {
            double total = 0.0;
            
            // Loop through the arguments to parse and sum the marks
            for (int i = 0; i < args.length; i++) {
                total += Double.parseDouble(args[i]);
            }

            // Calculate the average marks
            double average = total / 5.0;

            // Print the total and average results
            System.out.println("--- Results ---");
            System.out.println("Total Marks   : " + total);
            System.out.println("Average Marks : " + average);

        } catch (NumberFormatException e) {
            System.out.println("Error: Please ensure all provided inputs are valid numeric marks.");
        }
    }
}
