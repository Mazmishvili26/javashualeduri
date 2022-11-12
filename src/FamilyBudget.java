import java.io.FileWriter;
import java.io.IOException;

public class FamilyBudget extends FamilyMember {

    private int money = 40000;

    public int getMoney () {
        return this.money;
    }

    String moneySaver;

    public void FamilyMoney () {

        if(money >= 40000){
            moneySaver = "mdidaria";
        }else if (money >= 10000){
            moneySaver = "sashualo";
        }else{
            moneySaver = "gharibia";
        }
    }


    public void BudgetSaver () {

        try {
            FileWriter fw = new FileWriter("C:\\Users\\nikam\\IdeaProjects\\javashualeduri\\src/budget.txt");
            fw.write(moneySaver);
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
