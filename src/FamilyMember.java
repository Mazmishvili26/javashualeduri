import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FamilyMember {

    private String name (String firstName) {
        firstName = "Nika";
        return firstName;
    }

    private String lastName (String lastName) {
        lastName = "Mazmishvili";
        return lastName;
    }

   private String age (String age) {
        age = "21";
       return age;
   }

    private String status (String status) {
        status = "Student";
        return status;
    }

    public  FamilyMember () {
        this.name("firstName");
        this.lastName("lastName");
        this.age("age");
        this.status("Status");
    }


    public void familyMemberSaver () {
        try {
            FileWriter fw = new FileWriter("C:\\Users\\nikam\\IdeaProjects\\javashualeduri\\src/family.txt");
            FamilyMember fm = new FamilyMember();

            fw.write(fm.name("firstName \n "));
            fw.write(fm.lastName("lastName \n "));
            fw.write(fm.age("age \n "));
            fw.write(fm.status("Status \n "));

            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


    public void mimartva () {


        int motxovna;

        System.out.println("moitxove tanxa : ");
        Scanner sc = new Scanner(System.in);
        motxovna = sc.nextInt();

        FamilyBudget fg = new FamilyBudget();
        int money = fg.getMoney();

        if(motxovna <= money){
            System.out.println("motxovna warmatebit shesrulda!!!");
        }else if(motxovna > money){
            System.out.println("amdeni tanxa ar aris sacavshi!!!");
        }


    }






}
