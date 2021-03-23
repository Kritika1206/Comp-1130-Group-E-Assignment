public class Table {
    private int width = 0;
    private int height = 0;
    private String numbers = " | 1  | 2 | 3 | 4 | 5 | 6 | " ;


    public Table(int width, int height, String Numbers) {
        this.width = width;
        this.height = height;
        this.numbers = Numbers;
    }
    
    public String getNumbers() { return numbers; }
    
    public String getTable(){
        width = 6;
        height = 8;
        numbers = " | 1  | 2 | 3 | 4 | 5 | 6 | " +
                "| 7  | 8 | 9 | 10| 11| 12|" +
                "| 13 | 14| 15| 16| 17| 18| " +
                "|29  | 20| 21| 22| 23| 24| " +
                "|25  | 26| 27| 28| 29| 30| " +
                "|31  | 32| 33| 34| 35| 36| " +
                "|37  | 38| 39| 40| 41| 42| " +
                "|43  | 44| 45| 46| 47| 48| ";
        return numbers;
    }

}
