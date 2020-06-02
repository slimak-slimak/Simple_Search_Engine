public class AplicationArguments {
    String fileName;

    AplicationArguments (String[] args){
        if (args!=null){
            fileName = args[1];
        }
        else {
            System.out.println("Arguments loading error");
        }
    }
}
