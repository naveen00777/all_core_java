class q{
    public void person(String name,int age){
        System.out.println(name+age);
    }class r{
        public void emp(int id,String name, int salary)
        {
            System.out.println(id+name+salary);
        }
        public void dept(int id,String name)
        {
            System.out.println(id+name);
        }
        public void hr(int id,String location)
        {
            System.out.println(id+location);
        }
    }

}
public class day11_nested_class_example {
    public static void main(String[] args) {
        q a = new q();
        q.r b = a.new r();
        a.person("naveen  ",12);
        b.emp(12345,"  raju  ",12345);
        b.dept(123,"   jaggu");
        b.hr(1234,"   dolakpur");
    }
}
