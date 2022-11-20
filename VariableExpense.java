import java.util.ArrayList;
import java.util.List;

public class VariableExpense extends Expense{
	protected byte priority;
	List <Byte> priorityList = new ArrayList<>();

    public void registerExpense(String name, String description, float value) {
        this.name = name;
        nameList.add(name);
        
        this.value = value;
        valueList.add(value);

        this.description = description;
        nameList.add(description);
        
    }
}
