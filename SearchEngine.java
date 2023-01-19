import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;

class Handler implements URLHandler {
    // The one bit of state on the server: a number that will be manipulated by
    // various requests.
    ArrayList<String> words = new ArrayList<String>();

    public String handleRequest(URI url) {
            //finish this section
            if (url.getPath().contains("/add")) {
                String[] parameters = url.getQuery().split("="); 
                    //num += Integer.parseInt(parameters[1]);
                    //return String.format("Number increased by %s! It's now %d", parameters[1], num);
            }
            return "";
    }
}

public class SearchEngine {
    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            System.out.println("Missing port number! Try any number between 1024 to 49151");
            return;
        }

        int port = Integer.parseInt(args[0]);

        Server.start(port, new Handler());
    }
}

