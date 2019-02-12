import java.util.ArrayList;
import java.util.Collections;

public class Education {
//    Create an Education class and make an instance of the Education class a member of the Person class. Your education
//    class should include a list of last 10 schools attended. Create a toString() override for both Job and Education
//    that outputs the information in the class to the console. The toString() override for Person should use the toString()
//    methods for the Job and Education member objects.
    private ArrayList<String> schools;
    public Education(){
        schools = new ArrayList<>();
    }

    public void setSchools(ArrayList<String> schools) {
        Collections.addAll(schools,"Blake","Blair","Paint Branch","Montgomery College","University of Rochester",
                "Yale","Cornell","Standford", "Harvard","University of California, Los Angeles");
        this.schools = schools;
    }
    @Override
    public String toString(){
        return  "Education:   " + getSchools() + "\n";
    }

    public ArrayList<String> getSchools() {
        return schools;
    }
}
