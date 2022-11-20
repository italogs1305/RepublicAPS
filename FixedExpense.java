import java.util.ArrayList;
import java.util.List;

public class FixedExpense extends Expense {
    protected String payday;
    List <String> paydayList = new ArrayList<>();
    
    public void registerExpense(String name, String description, float value, String payday) {
        this.name = name;
        nameList.add(name);
        
        this.value = value;
        valueList.add(value);

        this.description = description;
        descriptionList.add(description);

    }
}