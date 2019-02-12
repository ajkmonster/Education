import java.util.ArrayList;

public class Person {
    //composition has-a relationship
    private Job job;
    private Education education;
    public Person(){
        this.job=new Job();
        job.setSalary(60000L);
        job.setRole("Accountant");
        job.setId(3456);
        this.education=new Education();
        education.setSchools(new ArrayList<>());
    }
    public long getSalary() {
        return job.getSalary();
    }

    @Override
    public String toString(){
        return  job.toString()+education.toString();
    }
}