import java.util.List;
import java.util.ArrayList;

public class CalculateExpenses extends Student{
    List <Float> cashStock = new ArrayList<>();
    public void emergencyDeposit(){
        float tax = (float) (income * 0.05);
        cashStock.add(tax);
    }
}
