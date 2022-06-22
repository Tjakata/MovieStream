package com.example.videostream;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.concurrent.Worker;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class DisplayController implements Initializable {

    private Stage primaryStage;
    private Scene scene;
    private Parent fxmlLoader;
    @FXML
    private WebView browser = new WebView(); //webview id

    @FXML
    private Hyperlink btnBack = new Hyperlink(); //back button id
    @FXML
    private Label label = new Label(); //load trailer label id
    @FXML
    private ProgressBar proBar = new ProgressBar(); //trailer load progress bar

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        //Trailers url methods call to show trailer in the webview in the scene
        emma();
        idiot();
        cSLove();
        instantF();
        theProm();
        iLeave();
        myWindow();
        thought();

        avat();
        aven();
        bad();
        doctor();
        furious();
        spect();
        trans();
        ven();

        quieter();
        blade();
        block();
        colo();
        pacific();
        snow();
        endless();
        theSkin();

        setImage();
    }

    //trailers url methods
    public void emma(){
        String url = "https://www.youtube.com/watch?v=qsOwj0PR5Sk";
        WebEngine webEngine = browser.getEngine();
        webEngine.load(url);
        loadVideo();
    }
    public void idiot(){
        String url = "https://www.youtube.com/watch?v=xvszmNXdM4w";
        WebEngine webEngine = browser.getEngine();
        webEngine.load(url);
        loadVideo();
    }
    public void cSLove(){
        String url = "https://www.youtube.com/watch?v=W83iZJbVH0A";
        WebEngine webEngine = browser.getEngine();
        webEngine.load(url);
        loadVideo();
    }
    public void instantF(){
        String url = "https://www.youtube.com/watch?v=IUfZq3DUd3Y";
        WebEngine webEngine = browser.getEngine();
        webEngine.load(url);
        loadVideo();
    }
    public void theProm(){
        String url = "https://www.youtube.com/watch?v=TJ0jBNa6JUQ";
        WebEngine webEngine = browser.getEngine();
        webEngine.load(url);
        loadVideo();
    }
    public void iLeave(){
        String url = "https://www.youtube.com/watch?v=fH0cEP0mvlU";
        WebEngine webEngine = browser.getEngine();
        webEngine.load(url);
        loadVideo();
    }
    public void myWindow(){
        String url = "https://www.youtube.com/watch?v=_wJTO_d_AJo";
        WebEngine webEngine = browser.getEngine();
        webEngine.load(url);
        loadVideo();
    }
    public void thought(){
        String url = "https://www.youtube.com/watch?v=9RFTpObS95U";
        WebEngine webEngine = browser.getEngine();
        webEngine.load(url);
        loadVideo();
    }
    public void avat(){
        String url = "https://www.youtube.com/watch?v=5PSNL1qE6VY";
        WebEngine webEngine = browser.getEngine();
        webEngine.load(url);
        loadVideo();
    }
    public void aven(){
        String url = "https://www.youtube.com/watch?v=eOrNdBpGMv8";
        WebEngine webEngine = browser.getEngine();
        webEngine.load(url);
        loadVideo();
    }
    public void bad(){
        String url = "https://www.youtube.com/watch?v=mqqft2x_Aa4";
        WebEngine webEngine = browser.getEngine();
        webEngine.load(url);
        loadVideo();
    }
    public void quieter(){
        String url = "https://www.youtube.com/watch?v=WR7cc5t7tv8";
        WebEngine webEngine = browser.getEngine();
        webEngine.load(url);
        loadVideo();
    }
    public void doctor(){
        String url = "https://www.youtube.com/watch?v=h7gvFravm4A";
        WebEngine webEngine = browser.getEngine();
        webEngine.load(url);
        loadVideo();
    }
    public void furious(){
        String url = "https://www.youtube.com/watch?v=aSiDu3Ywi8E";
        WebEngine webEngine = browser.getEngine();
        webEngine.load(url);
        loadVideo();
    }
    public void spect(){
        String url = "https://www.youtube.com/watch?v=7GqClqvlObY";
        WebEngine webEngine = browser.getEngine();
        webEngine.load(url);
        loadVideo();
    }
    public void trans(){
        String url = "https://www.youtube.com/watch?v=dxQxgAfNzyE";
        WebEngine webEngine = browser.getEngine();
        webEngine.load(url);
        loadVideo();
    }
    public void ven(){
        String url = "https://www.youtube.com/watch?v=u9Mv98Gr5pY";
        WebEngine webEngine = browser.getEngine();
        webEngine.load(url);
        loadVideo();
    }
    public void blade(){
        String url = "https://www.youtube.com/watch?v=gCcx85zbxz4";
        WebEngine webEngine = browser.getEngine();
        webEngine.load(url);
        loadVideo();
    }
    public void block(){
        String url = "https://www.youtube.com/watch?v=cD0gm7dHKKc";
        WebEngine webEngine = browser.getEngine();
        webEngine.load(url);
        loadVideo();
    }
    public void colo(){
        String url = "https://www.youtube.com/watch?v=RT2khohvjLE";
        WebEngine webEngine = browser.getEngine();
        webEngine.load(url);
        loadVideo();
    }
    public void pacific(){
        String url = "https://www.youtube.com/watch?v=8BAhwgjMvnM";
        WebEngine webEngine = browser.getEngine();
        webEngine.load(url);
        loadVideo();
    }
    public void snow(){
        String url = "https://www.youtube.com/watch?v=lGcJL6TG5cA";
        WebEngine webEngine = browser.getEngine();
        webEngine.load(url);
        loadVideo();
    }
    public void endless(){
        String url = "https://www.youtube.com/watch?v=OqhJm5qXw-k";
        WebEngine webEngine = browser.getEngine();
        webEngine.load(url);
        loadVideo();
    }
    public void theSkin(){
        String url = "https://www.youtube.com/watch?v=7S1yhSp5jaI";
        WebEngine webEngine = browser.getEngine();
        webEngine.load(url);
        loadVideo();
    }
    public void loadVideo(){
        WebEngine webEngine = browser.getEngine();
        Worker<Void> worker = webEngine.getLoadWorker();
        worker.stateProperty().addListener(new ChangeListener<Worker.State>() {
            @Override
            public void changed(ObservableValue<? extends Worker.State> observableValue, Worker.State oldState, Worker.State newState) {
                label.setText("LOADING...");
                if (newState == Worker.State.SUCCEEDED){
                    label.setVisible(false);
                    proBar.setVisible(false);
                }
            }
        });
        proBar.progressProperty().bind(worker.progressProperty());
    }

    //Creating back button
    public Hyperlink setImage(){

        Image image = new Image("/back.png");
        ImageView view = new ImageView(image);
        btnBack.setGraphic(view);
        view.setFitHeight(25);
        view.setFitWidth(25);
        view.setPreserveRatio(true);

        return btnBack;
    }
    //Method to switch to main fxml(hello-view) when back button is clicked
    public void switchToView(ActionEvent event) throws IOException {

        fxmlLoader = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        primaryStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(fxmlLoader,780, 620);
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.setTitle("Movies");
        primaryStage.show();

        WebEngine webEngine = browser.getEngine();
        webEngine.load(null);

    }
}
