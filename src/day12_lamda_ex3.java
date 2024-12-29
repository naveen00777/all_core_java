@FunctionalInterface
interface i3{
    void details(String name, String location);
}public class day12_lamda_ex3 {
    public static void main(String[] args) {
        i3 i = ((name, location) -> System.out.println("name: "+name+";"+"\nlocation: "+location+"."));
        i.details("naveen","bangalore");
    }
}
