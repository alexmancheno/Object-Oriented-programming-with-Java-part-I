
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;

    public CashRegister() {
        this.cashInRegister = 1000.0;
    }

    public void loadMoneyToCard(LyyraCard card, double sum) {
        if (sum >= 0) {
            card.loadMoney(sum);
            this.cashInRegister += sum;
    
        }
    }

    public double payEconomical(double cashGiven) {
        double economicalPrice = 2.50;
        if (cashGiven >= economicalPrice) {
            this.cashInRegister += economicalPrice;
            economicalSold++;
            return cashGiven - economicalPrice;
        }
        return cashGiven;
    }

    public boolean payEconomical(LyyraCard card) {
        double economicalPrice = 2.50;
        if (card.balance() >= economicalPrice) {
            economicalSold++;
            card.pay(economicalPrice);
            return true;
        }
        return false;
    }

    public double payGourmet(double cashGiven) {
        double gourmetPrice = 4.00;
        if (cashGiven >= gourmetPrice) {
            this.cashInRegister += gourmetPrice;
            this.gourmetSold++;
            return cashGiven - gourmetPrice;
        }
        return cashGiven;
    }

    public boolean payGourmet(LyyraCard card) {
        double gourmetPrice = 4.00;
        if (card.balance() >= gourmetPrice) {
            card.pay(gourmetPrice);
            gourmetSold++;
            return true;
        }
        return false;
    }

    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}
