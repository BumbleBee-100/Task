public class CourseReg{
    static class Student{
        int id;
        String name,program;
        Student(int id,String name,String program){
            this.id=id;
            this.name=name;
            this.program=program;
        }
    }
    static class Instructor{
        int id;
        String name,department,title;
        Instructor(int id,String name,String department,String title){
            this.id=id;
            this.name=name;
            this.department=department;
            this.title=title;
        }
    }
    static class Course{
        int id;
        String syllabus,title,credits,prerequisite;
        Course(int id,String title,String credits,String prereq){
            this.id=id;
            this.title=title;
            this.credits=credits;
            this.prerequisite=prereq;
        }
        public String toString(){
            return "Course["+id+"] "+title+" ("+credits+" credits)";
        }
    }
    static class CourseOffering{
        int studentId,instructorId,courseId,sectionNo,roomId,year;
        String time,semester;
        CourseOffering(int sid,int iid,int cid,String time,int sec,int room,int year,String sem){
            studentId=sid;
            instructorId=iid;
            courseId=cid;
            this.time=time;
            sectionNo=sec;
            roomId=room;
            this.year=year;
            semester=sem;
        }

        public String toString(){
            return String.format("Offering -> Student:%d Instructor:%d Course:%d %s %d",studentId,instructorId,courseId,semester,year);
        }
    }
    public static void main(String[] args){
        Course c=new Course(101,"OOP with Java","3","Intro to Programming");
        Student s=new Student(1,"Kakashi","CSE");
        Instructor ins=new Instructor(50,"Dr. Smith","CSE","Professor");

        CourseOffering off=new CourseOffering(s.id,ins.id,c.id,"10:00 AM",1,301,2023,"Spring"
        );
        System.out.println(c);
        System.out.println(off);
    }
}