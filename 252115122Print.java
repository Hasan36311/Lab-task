package task.java;

public class Print {

    String documentName;
    double costperPage;

    double calculateCost(int page) {
        return page * costperPage;
    }

    double calculateCost(int pages, boolean colorprint) {
        if (colorprint) {
            return pages * costperPage * 2.5;
        } else {
            return pages * costperPage;
        }
    }

    public static void main(String[] args) {
        Print p = new Print();
        p.documentName = "Story Book";
        p.costperPage = 2.00;

        System.out.println(p.calculateCost(10));
        System.out.println(p.calculateCost(10, true));
    }
}
