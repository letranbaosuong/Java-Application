package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("kha");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }

    public static void main(String[] args) throws IOException, InterruptedException {

        launch(args);
//        HttpClient client = HttpClient.newHttpClient();
//        HttpRequest request = HttpRequest.newBuilder()
//                .uri(URI.create("http://webcode.me"))
//                .build();
//
//        HttpResponse<String> response = client.send(request,
//                HttpResponse.BodyHandlers.ofString());
//
//        System.out.println(response.body());

        // Tạo đối tượng Client
        Client client = Client.create();

        WebResource webResource = client.resource("http://localhost:8080/RESTfulCRUD/rest/employees/E01");

        ClientResponse response = webResource.accept("application/json").get(ClientResponse.class);


        // Trạng thái 200 là thành công
        if (response.getStatus() != 200) {
            System.out.println("Failed with HTTP Error code: " + response.getStatus());
            String error= response.getEntity(String.class);
            System.out.println("Error: "+error);
            return;
        }

        String output = response.getEntity(String.class);

        System.out.println("Output from Server .... \n");
        System.out.println(output);
    }
}
