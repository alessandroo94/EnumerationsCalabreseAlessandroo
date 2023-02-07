public class Start {
    public static void main(String[] args) {
        for (Month month : Month.values()) {
            String monthName = month.name();
            if (monthName.endsWith("Y")) {
                System.out.println(monthName + " ends with Y");
            } else {
                System.out.println(monthName + " doesn't end with Y");
            }
        }
    }
}