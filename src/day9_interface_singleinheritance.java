import org.w3c.dom.ls.LSOutput;

interface justin{
    public void song();
}interface bieber extends justin{
        public void singer();
    }interface usa extends bieber{
            public void country();
        }class playlist implements usa{
                public void song(){
                    System.out.println("baby");
                }public void singer(){
                    System.out.println("justin bieber");
                }public void country(){
                    System.out.println("united states of america");
                }

}
public class day9_interface_singleinheritance {
    public static void main(String[] args) {
        playlist p = new playlist();
            p.song();
            p.singer();
            p.country();
    }
}
