import java.util.List;
import java.util.ArrayList;

//interface class made for make sure VariableExpense and FixedExpense uses sames attributes
abstract class Expense {
    
    protected String name;
    protected float value;
    protected String description;
    //array list containing information about new expense declared    
    List <String> nameList = new ArrayList<>();
    List <Float> valueList = new ArrayList<>();
    List <String> descriptionList = new ArrayList<>();

    //blank constructor
    public void registerExpense(){
    }
}