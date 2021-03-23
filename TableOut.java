public class TableOut {
    public static void main(String[] args) {

        System.out.println("Number Table:");
        Table Table1 = new Table( 6 ,8,
        "| 1  | 2  | 3  | 4  | 5  | 6  |" +"\n"+
        "| 7  | 8  | 9  | 10 | 11 | 12 |" +"\n"+
        "| 13 | 14 | 15 | 16 | 17 | 18 |" +"\n"+
        "| 29 | 20 | 21 | 22 | 23 | 24 |" +"\n"+
        "| 25 | 26 | 27 | 28 | 29 | 30 |" +"\n"+
        "| 31 | 32 | 33 | 34 | 35 | 36 |" +"\n"+
        "| 37 | 38 | 39 | 40 | 41 | 42 |" +"\n"+
        "| 43 | 44 | 45 | 46 | 47 | 48 |");
        System.out.println(Table1.getNumbers());
    }
}