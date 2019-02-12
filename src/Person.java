import java.util.ArrayList;

public class Person {
    //composition has-a relationship
    private Job job;
    private Education education;
    private ArrayList<String> education1;
    private String educationString;
    public Person(){
        education1 = new ArrayList<>();
        this.job=new Job();
        job.setSalary(60000L);
        job.setRole("Accountant");
        job.setId(3456);
        this.education=new Education();
        education.setSchools(education1);
    }
    public long getSalary() {
        return job.getSalary();
    }

    @Override
    public String toString(){
        return  job.toString()+"Education:   " +makeString()+ "\n";
    }
    public String makeString(){
        educationString = educationString.join(",",education1);
        return educationString;
    }
}