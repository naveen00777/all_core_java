interface bahubali1{
    public void avantika();
}
interface bahubali2{
    public void devasena();
}
class mahendra implements bahubali1,bahubali2{
    public void avantika(){
        System.out.println("wife");
    }
    public void devasena(){
        System.out.println("mom");
    }
}

public class day9_interface_multiple_inheritance {
    public static void main(String[] args) {
mahendra m = new mahendra();
m.avantika();
m.devasena();
    }
}
