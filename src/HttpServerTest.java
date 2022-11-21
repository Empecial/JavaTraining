import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;


public class HttpServerTest {
    public static void main(String[] args) throws IOException {

        final ServerSocket server = new ServerSocket(8080);
        
        final Socket client = server.accept();

        System.out.println("port 8080 open");
       /*  while(true){
        } */

        getTodaysDate(server);

        getClientInformation(client);
    }

    static void getClientInformation(Socket client) throws IOException{
        InputStreamReader inputStreamReader = new InputStreamReader(client.getInputStream());

            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            String line = bufferedReader.readLine();

            while(!line.isEmpty()){
                System.out.println(line);

                line = bufferedReader.readLine();
            }
    }

    static void getTodaysDate(ServerSocket server){

        while(true){

            
            try (Socket socket = server.accept()) {
                Date dateToday = new Date();

                String httpResponse = "HTTP\1.1 200 OK\r\n\r\n" + dateToday;

                socket.getOutputStream().write(httpResponse.getBytes("UTF-8"));

            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
}
