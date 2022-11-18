import java.util.List;
import java.util.ArrayList;

abstract class Expense {
    
    protected String name;
    protected float value;
    protected String description;
    List <String> nameList = new ArrayList<>();
    List <Float> valueList = new ArrayList<>();
    List <String> descriptionList = new ArrayList<>();

    public void registerExpense(){
    }
}