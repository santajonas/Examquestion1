import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import java.lang.System;

public class Test extends Application  {
    static ServiceBook serviceBook = new ServiceBook();
    Button button;
    Button button2;
    Button button3;


    public static void main(String[] args) {

        //ServiceBook serviceBook = new ServiceBook();
        Date date1 = new Date(15, 12, 2018);
        Date date2 = new Date(1, 10, 2018);
        Date date3 = new Date(30, 1, 2017);
        Date date4 = new Date(1, 1, 2019);
        Date date5 = new Date(25, 9, 2018);

        Service service1 = new Service(5641, date1);
        Service service2 = new Service(5416, date2);
        Service service3 = new Service(54789, date3);
        Service service4 = new Service(213, date4);
        Service service5 = new Service(213, date5);

        serviceBook.addService(service1);
        serviceBook.addService(service2);
        serviceBook.addService(service3);
        serviceBook.addService(service4);
        serviceBook.addService(service5);

        Application.launch(args);

    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("servicebook");
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(5, 5, 5, 5));


        //button for getDateOfLastService
        button = new Button();
        button.setText("Date of last Service");
        grid.add(button,0,0);
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println(serviceBook.getDateOfLastService());
            }
        });


        //button for getAllServiceMileages
        button2=new Button();
        button2.setText("total mileages");
        grid.add(button2,0,1);
        button2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("total mileages" + serviceBook.getAllServiceMileages());
            }
        });

        //button for services
        button3 = new Button();
        button3.setText("Services");
        grid.add(button3,0,2);
        button3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println(serviceBook.toString());
            }
        });



        Scene scene = new Scene(grid, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();


    }




    }
