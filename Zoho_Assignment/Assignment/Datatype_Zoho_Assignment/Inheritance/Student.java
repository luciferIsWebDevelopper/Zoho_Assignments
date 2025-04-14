class Student {
    int id;
    String name;
 Student(String name , int id)   {
    this.name=name;
    this.id=id;
 }
}
class ZsgsStudent extends Student{
ZsgsStudent(String name, int zsgsId,int batch){
    super(name, zsgsId);
}
class Main{
    public static void main(String[] args) {
        Student s=new ZsgsStudent("guru", 1, 2025)
        ZsgsStudent z=(ZsgsStudent)s;
        System.out.println(z.id);
    }
}
}
