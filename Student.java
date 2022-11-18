import java.util.List;
import java.util.ArrayList;

public class Student {
    protected String name;
    protected String email;
    protected float income;
    List <String> nameList = new ArrayList<>();
    List <String> emailList = new ArrayList<>();
    List <Float> incomeList = new ArrayList<>();

    public void registerPerson(String name, String email, float income) {
        this.name = name;
        nameList.add(name);

        this.email = email;
        emailList.add(email);

        this.income = income;
        incomeList.add(income);
    }
}