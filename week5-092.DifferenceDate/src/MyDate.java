public class MyDate {
    
    private int day;
    private int month;
    private int year;
    
    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    public int dateInDays() {
        int dateInDays = 0;
        for (int i = 0; i <= this.year; i++) {
            dateInDays += 360;
        }
        for (int i = 1; i <= this.month; i++) {
            dateInDays += 30;
        }
        for (int i = 1; i <= this.day; i++) {
            dateInDays++;
        }
        return dateInDays;
    }
    
    public int differenceInYears(MyDate comparedDate) {
        int differenceInDays = this.dateInDays() - comparedDate.dateInDays();
        if (differenceInDays < 0)
            return differenceInDays * (-1) / 360;
        return differenceInDays / 360;
    }
    
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }
    
    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }
        
        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }
        
        if (this.year == compared.year && this.month == compared.month
            && this.day < compared.day) {
            return true;
        }
        
        return false;
    }
    
}
