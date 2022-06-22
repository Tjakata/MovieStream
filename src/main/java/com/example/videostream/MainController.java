package com.example.videostream;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {
        private Stage primaryStage;
        private Scene scene;
        private Parent fxmlLoader;
        @FXML
        private ScrollPane scrollPane = new ScrollPane();

        //Drama
        @FXML
        private Hyperlink Emma = new Hyperlink();
        @FXML
        private Hyperlink thinkTwice = new Hyperlink();

        @FXML
        private Hyperlink cSL = new Hyperlink();

        @FXML
        private Hyperlink iFamily = new Hyperlink();

        @FXML
        private Hyperlink idiots = new Hyperlink();

        @FXML
        private Hyperlink leaveYou = new Hyperlink();

        @FXML
        private Hyperlink prom = new Hyperlink();

        @FXML
        private Hyperlink window = new Hyperlink();

        //Action
        @FXML
        private Hyperlink avatar = new Hyperlink();
        @FXML
        private Hyperlink avengers = new Hyperlink();
        @FXML
        private Hyperlink badman = new Hyperlink();
        @FXML
        private Hyperlink doctorStrange = new Hyperlink();
        @FXML
        private Hyperlink fast = new Hyperlink();
        @FXML
        private Hyperlink spectre = new Hyperlink();
        @FXML
        private Hyperlink transformers = new Hyperlink();
        @FXML
        private Hyperlink venom = new Hyperlink();

        //SciFi
        @FXML
        private Hyperlink quiet = new Hyperlink();
        @FXML
        private Hyperlink bladeRunner = new Hyperlink();
        @FXML
        private Hyperlink blockAttack = new Hyperlink();
        @FXML
        private Hyperlink colossal = new Hyperlink();
        @FXML
        private Hyperlink pacificRim = new Hyperlink();
        @FXML
        private Hyperlink snowPiercer = new Hyperlink();
        @FXML
        private Hyperlink theEndless = new Hyperlink();
        @FXML
        private Hyperlink underSkin = new Hyperlink();

        @Override
        public void initialize(URL url, ResourceBundle resourceBundle) {
                //These will show scroll bar as needed
                scrollPane.setHbarPolicy(ScrollPane.ScrollBarPolicy.AS_NEEDED);
                scrollPane.setVbarPolicy(ScrollPane.ScrollBarPolicy.AS_NEEDED);

                //thumbnails methods call
                dramaThumbnail();
                actionThumbnail();
                sciFiThumbnail();
        }

        //Create thumbnails methods
        public void dramaThumbnail(){
                String emma = getClass().getResource("/Comedy/emma.jpg").toExternalForm(); //fetch image from resources
                ImageView view = new ImageView();
                Image image = new Image(emma);
                Emma.setGraphic(view); //set image graphic to hyperlink
                view.setImage(image);
                view.setFitHeight(Emma.getPrefHeight());
                view.setFitWidth(Emma.getPrefWidth());
                view.setPreserveRatio(true); //preserve image ratio

                String idiot = getClass().getResource("/Comedy/3 idiots thumbnail.jpg").toExternalForm();
                ImageView viewIdiot = new ImageView();
                Image imageIdiot = new Image(idiot);
                idiots.setGraphic(viewIdiot);
                viewIdiot.setImage(imageIdiot);
                viewIdiot.setFitHeight(idiots.getPrefHeight());
                viewIdiot.setFitWidth(idiots.getPrefWidth());
                viewIdiot.setPreserveRatio(true);

                String family = getClass().getResource("/Comedy/instant family.jpg").toExternalForm();
                ImageView viewFamily = new ImageView();
                Image imageFamily = new Image(family);
                iFamily.setGraphic(viewFamily);
                viewFamily.setImage(imageFamily);
                viewFamily.setFitHeight(iFamily.getPrefHeight());
                viewFamily.setFitWidth(iFamily.getPrefWidth());
                viewFamily.setPreserveRatio(true);

                String crazy = getClass().getResource("/Comedy/crazy stupid love.jpg").toExternalForm();
                ImageView viewCrazy = new ImageView();
                Image imageCrazy = new Image(crazy);
                cSL.setGraphic(viewCrazy);
                viewCrazy.setImage(imageCrazy);
                viewCrazy.setFitHeight(cSL.getPrefHeight());
                viewCrazy.setFitWidth(cSL.getPrefWidth());
                viewCrazy.setPreserveRatio(true);

                String the_prom = getClass().getResource("/Comedy/the prom.jpg").toExternalForm();
                ImageView viewProm = new ImageView();
                Image imageProm = new Image(the_prom);
                prom.setGraphic(viewProm);
                viewProm.setImage(imageProm);
                viewProm.setFitHeight(prom.getPrefHeight());
                viewProm.setFitWidth(prom.getPrefWidth());
                viewProm.setPreserveRatio(true);

                String leave = getClass().getResource("/Comedy/this is where i leave you.jpg").toExternalForm();
                ImageView viewLeave = new ImageView();
                Image imageLeave = new Image(leave);
                leaveYou.setGraphic(viewLeave);
                viewLeave.setImage(imageLeave);
                viewLeave.setFitHeight(leaveYou.getPrefHeight());
                viewLeave.setFitWidth(leaveYou.getPrefWidth());
                viewLeave.setPreserveRatio(true);

                String my_window = getClass().getResource("/Comedy/Through-My-Window.jpg").toExternalForm();
                ImageView viewWindow = new ImageView();
                Image imageWindow = new Image(my_window);
                window.setGraphic(viewWindow);
                viewWindow.setImage(imageWindow);
                viewWindow.setFitHeight(window.getPrefHeight());
                viewWindow.setFitWidth(window.getPrefWidth());
                viewWindow.setPreserveRatio(true);

                String think = getClass().getResource("/Comedy/Don't_Think_Twice.png").toExternalForm();
                ImageView viewThink = new ImageView();
                Image imageThink = new Image(think);
                thinkTwice.setGraphic(viewThink);
                viewThink.setImage(imageThink);
                viewThink.setFitHeight(thinkTwice.getPrefHeight());
                viewThink.setFitWidth(thinkTwice.getPrefWidth());
                viewThink.setPreserveRatio(true);

        }
        public void actionThumbnail(){
                String ava = getClass().getResource("/Action/avatar.jpg").toExternalForm();
                ImageView viewAvatar = new ImageView();
                Image imageAvatar = new Image(ava);
                avatar.setGraphic(viewAvatar);
                viewAvatar.setImage(imageAvatar);
                viewAvatar.setFitHeight(avatar.getPrefHeight());
                viewAvatar.setFitWidth(avatar.getPrefWidth());
                viewAvatar.setPreserveRatio(true);

                String avenge = getClass().getResource("/Action/avengers.jpg").toExternalForm();
                ImageView viewAvenge = new ImageView();
                Image imageAvenge = new Image(avenge);
                avengers.setGraphic(viewAvenge);
                viewAvenge.setImage(imageAvenge);
                viewAvenge.setFitHeight(avengers.getPrefHeight());
                viewAvenge.setFitWidth(avengers.getPrefWidth());
                viewAvenge.setPreserveRatio(true);

                String bad = getClass().getResource("/Action/badman.jpg").toExternalForm();
                ImageView viewBad = new ImageView();
                Image imageBad = new Image(bad);
                badman.setGraphic(viewBad);
                viewBad.setImage(imageBad);
                viewBad.setFitHeight(badman.getPrefHeight());
                viewBad.setFitWidth(badman.getPrefWidth());
                viewBad.setPreserveRatio(true);

                String doc = getClass().getResource("/Action/doctorStrange.jpg").toExternalForm();
                ImageView viewDoc = new ImageView();
                Image imageDoc = new Image(doc);
                doctorStrange.setGraphic(viewDoc);
                viewDoc.setImage(imageDoc);
                viewDoc.setFitHeight(doctorStrange.getPrefHeight());
                viewDoc.setFitWidth(doctorStrange.getPrefWidth());
                viewDoc.setPreserveRatio(true);

                String furious = getClass().getResource("/Action/fast.jpg").toExternalForm();
                ImageView viewFast = new ImageView();
                Image imageFast = new Image(furious);
                fast.setGraphic(viewFast);
                viewFast.setImage(imageFast);
                viewFast.setFitHeight(fast.getPrefHeight());
                viewFast.setFitWidth(fast.getPrefWidth());
                viewFast.setPreserveRatio(true);

                String spec = getClass().getResource("/Action/spectre.jpg").toExternalForm();
                ImageView viewSpec = new ImageView();
                Image imageSpec = new Image(spec);
                spectre.setGraphic(viewSpec);
                viewSpec.setImage(imageSpec);
                viewSpec.setFitHeight(spectre.getPrefHeight());
                viewSpec.setFitWidth(spectre.getPrefWidth());
                viewSpec.setPreserveRatio(true);

                String trans = getClass().getResource("/Action/Transformers.jpg").toExternalForm();
                ImageView viewTrans = new ImageView();
                Image imageTrans = new Image(trans);
                transformers.setGraphic(viewTrans);
                viewTrans.setImage(imageTrans);
                viewTrans.setFitHeight(transformers.getPrefHeight());
                viewTrans.setFitWidth(transformers.getPrefWidth());
                viewTrans.setPreserveRatio(true);

                String ven = getClass().getResource("/Action/venom.jpg").toExternalForm();
                ImageView viewVen = new ImageView();
                Image imageVen = new Image(ven);
                venom.setGraphic(viewVen);
                viewVen.setImage(imageVen);
                viewVen.setFitHeight(venom.getPrefHeight());
                viewVen.setFitWidth(venom.getPrefWidth());
                viewVen.setPreserveRatio(true);

        }
        public void sciFiThumbnail(){
                String qui = getClass().getResource("/Sci-fi/quiet.jpg").toExternalForm();
                ImageView viewQuiet = new ImageView();
                Image imageQuiet = new Image(qui);
                quiet.setGraphic(viewQuiet);
                viewQuiet.setImage(imageQuiet);
                viewQuiet.setFitHeight(quiet.getPrefHeight());
                viewQuiet.setFitWidth(quiet.getPrefWidth());
                viewQuiet.setPreserveRatio(true);

                String blade = getClass().getResource("/Sci-fi/bladeRunner.jpg").toExternalForm();
                ImageView viewBlade = new ImageView();
                Image imageBlade = new Image(blade);
                bladeRunner.setGraphic(viewBlade);
                viewBlade.setImage(imageBlade);
                viewBlade.setFitHeight(bladeRunner.getPrefHeight());
                viewBlade.setFitWidth(bladeRunner.getPrefWidth());
                viewBlade.setPreserveRatio(true);

                String block = getClass().getResource("/Sci-fi/blockAttack.jpg").toExternalForm();
                ImageView viewBlock = new ImageView();
                Image imageBlock = new Image(block);
                blockAttack.setGraphic(viewBlock);
                viewBlock.setImage(imageBlock);
                viewBlock.setFitHeight(blockAttack.getPrefHeight());
                viewBlock.setFitWidth(blockAttack.getPrefWidth());
                viewBlock.setPreserveRatio(true);

                String colo = getClass().getResource("/Sci-fi/colossal.jpg").toExternalForm();
                ImageView viewColo = new ImageView();
                Image imageColo = new Image(colo);
                colossal.setGraphic(viewColo);
                viewColo.setImage(imageColo);
                viewColo.setFitHeight(colossal.getPrefHeight());
                viewColo.setFitWidth(colossal.getPrefWidth());
                viewColo.setPreserveRatio(true);

                String pacific = getClass().getResource("/Sci-fi/PacificRimUprising.jpg").toExternalForm();
                ImageView viewPacific = new ImageView();
                Image imagePacific = new Image(pacific);
                pacificRim.setGraphic(viewPacific);
                viewPacific.setImage(imagePacific);
                viewPacific.setFitHeight(pacificRim.getPrefHeight());
                viewPacific.setFitWidth(pacificRim.getPrefWidth());
                viewPacific.setPreserveRatio(true);

                String snow = getClass().getResource("/Sci-fi/snowPiercer.jpg").toExternalForm();
                ImageView viewSnow = new ImageView();
                Image imageSnow = new Image(snow);
                snowPiercer.setGraphic(viewSnow);
                viewSnow.setImage(imageSnow);
                viewSnow.setFitHeight(snowPiercer.getPrefHeight());
                viewSnow.setFitWidth(snowPiercer.getPrefWidth());
                viewSnow.setPreserveRatio(true);

                String endless = getClass().getResource("/Sci-fi/the endless.jpg").toExternalForm();
                ImageView viewEndless = new ImageView();
                Image imageEndless = new Image(endless);
                theEndless.setGraphic(viewEndless);
                viewEndless.setImage(imageEndless);
                viewEndless.setFitHeight(theEndless.getPrefHeight());
                viewEndless.setFitWidth(theEndless.getPrefWidth());
                viewEndless.setPreserveRatio(true);

                String under = getClass().getResource("/Sci-fi/Under_the_Skin.jpg").toExternalForm();
                ImageView viewUnder = new ImageView();
                Image imageUnder = new Image(under);
                underSkin.setGraphic(viewUnder);
                viewUnder.setImage(imageUnder);
                viewUnder.setFitHeight(underSkin.getPrefHeight());
                viewUnder.setFitWidth(underSkin.getPrefWidth());
                viewUnder.setPreserveRatio(true);

        }

        /*These methods swicth scene to video display scene and
        call url methods from DisplayController controller*/
        public void idiots(ActionEvent event) throws IOException {
                //loading video-display fxml
                FXMLLoader loader = new FXMLLoader(getClass().getResource("video-display.fxml"));
                fxmlLoader = loader.load();

                //liking displayController controller
                DisplayController displayController = loader.getController();
                displayController.idiot();

                /*fxmlLoader = FXMLLoader.load(getClass().getResource("video-display.fxml"));*/
                //Switch to video display scene
                primaryStage = (Stage) ((Node)event.getSource()).getScene().getWindow();
                scene = new Scene(fxmlLoader, 600, 400);
                scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
                primaryStage.setScene(scene);
                primaryStage.setTitle("Trailer");
                primaryStage.show();
        }

        public void cSL(ActionEvent event) throws IOException {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("video-display.fxml"));
                fxmlLoader = loader.load();

                DisplayController displayController = loader.getController();
                displayController.cSLove();

                //fxmlLoader = FXMLLoader.load(getClass().getResource("video-display.fxml"));
                primaryStage = (Stage) ((Node)event.getSource()).getScene().getWindow();
                scene = new Scene(fxmlLoader, 600, 400);
                scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
                primaryStage.setScene(scene);
                primaryStage.setTitle("Trailer");
                primaryStage.show();
        }

        public void iFamily(ActionEvent event) throws IOException {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("video-display.fxml"));
                fxmlLoader = loader.load();

                DisplayController displayController = loader.getController();
                displayController.instantF();

                //fxmlLoader = FXMLLoader.load(getClass().getResource("video-display.fxml"));
                primaryStage = (Stage) ((Node)event.getSource()).getScene().getWindow();
                scene = new Scene(fxmlLoader, 600, 400);
                scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
                primaryStage.setScene(scene);
                primaryStage.setTitle("Trailer");
                primaryStage.show();
        }

        public void prom(ActionEvent event) throws IOException {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("video-display.fxml"));
                fxmlLoader = loader.load();

                DisplayController displayController = loader.getController();
                displayController.theProm();

                //fxmlLoader = FXMLLoader.load(getClass().getResource("video-display.fxml"));
                primaryStage = (Stage) ((Node)event.getSource()).getScene().getWindow();
                scene = new Scene(fxmlLoader, 600, 400);
                scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
                primaryStage.setScene(scene);
                primaryStage.setTitle("Trailer");
                primaryStage.show();
        }

        public void leaveYou(ActionEvent event) throws IOException {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("video-display.fxml"));
                fxmlLoader = loader.load();

                DisplayController displayController = loader.getController();
                displayController.iLeave();

                //fxmlLoader = FXMLLoader.load(getClass().getResource("video-display.fxml"));
                primaryStage = (Stage) ((Node)event.getSource()).getScene().getWindow();
                scene = new Scene(fxmlLoader, 600, 400);
                scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
                primaryStage.setScene(scene);
                primaryStage.setTitle("Trailer");
                primaryStage.show();
        }

        public void window(ActionEvent event) throws IOException {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("video-display.fxml"));
                fxmlLoader = loader.load();

                DisplayController displayController = loader.getController();
                displayController.myWindow();

                //fxmlLoader = FXMLLoader.load(getClass().getResource("video-display.fxml"));
                primaryStage = (Stage) ((Node)event.getSource()).getScene().getWindow();
                scene = new Scene(fxmlLoader, 600, 400);
                scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
                primaryStage.setScene(scene);
                primaryStage.setTitle("Trailer");
                primaryStage.show();
        }

        public void avatar(ActionEvent event) throws IOException {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("video-display.fxml"));
                fxmlLoader = loader.load();

                DisplayController displayController = loader.getController();
                displayController.avat();

                //fxmlLoader = FXMLLoader.load(getClass().getResource("video-display.fxml"));
                primaryStage = (Stage) ((Node)event.getSource()).getScene().getWindow();
                scene = new Scene(fxmlLoader, 600, 400);
                scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
                primaryStage.setScene(scene);
                primaryStage.setTitle("Trailer");
                primaryStage.show();
        }

        public void quiet(ActionEvent event) throws IOException {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("video-display.fxml"));
                fxmlLoader = loader.load();

                DisplayController displayController = loader.getController();
                displayController.quieter();

                //fxmlLoader = FXMLLoader.load(getClass().getResource("video-display.fxml"));
                primaryStage = (Stage) ((Node)event.getSource()).getScene().getWindow();
                scene = new Scene(fxmlLoader, 600, 400);
                scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
                primaryStage.setScene(scene);
                primaryStage.setTitle("Trailer");
                primaryStage.show();
        }

        public void avengers(ActionEvent event) throws IOException {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("video-display.fxml"));
                fxmlLoader = loader.load();

                DisplayController displayController = loader.getController();
                displayController.aven();

                //fxmlLoader = FXMLLoader.load(getClass().getResource("video-display.fxml"));
                primaryStage = (Stage) ((Node)event.getSource()).getScene().getWindow();
                scene = new Scene(fxmlLoader, 600, 400);
                scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
                primaryStage.setScene(scene);
                primaryStage.setTitle("Trailer");
                primaryStage.show();
        }

        public void badman(ActionEvent event) throws IOException {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("video-display.fxml"));
                fxmlLoader = loader.load();

                DisplayController displayController = loader.getController();
                displayController.bad();

                //fxmlLoader = FXMLLoader.load(getClass().getResource("video-display.fxml"));
                primaryStage = (Stage) ((Node)event.getSource()).getScene().getWindow();
                scene = new Scene(fxmlLoader, 600, 400);
                scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
                primaryStage.setScene(scene);
                primaryStage.setTitle("Trailer");
                primaryStage.show();
        }

        public void doctorStrange(ActionEvent event) throws IOException {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("video-display.fxml"));
                fxmlLoader = loader.load();

                DisplayController displayController = loader.getController();
                displayController.doctor();

                //fxmlLoader = FXMLLoader.load(getClass().getResource("video-display.fxml"));
                primaryStage = (Stage) ((Node)event.getSource()).getScene().getWindow();
                scene = new Scene(fxmlLoader, 600, 400);
                scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
                primaryStage.setScene(scene);
                primaryStage.setTitle("Trailer");
                primaryStage.show();
        }

        public void fast(ActionEvent event) throws IOException {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("video-display.fxml"));
                fxmlLoader = loader.load();

                DisplayController displayController = loader.getController();
                displayController.furious();

                //fxmlLoader = FXMLLoader.load(getClass().getResource("video-display.fxml"));
                primaryStage = (Stage) ((Node)event.getSource()).getScene().getWindow();
                scene = new Scene(fxmlLoader, 600, 400);
                scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
                primaryStage.setScene(scene);
                primaryStage.setTitle("Trailer");
                primaryStage.show();
        }

        public void spectre(ActionEvent event) throws IOException {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("video-display.fxml"));
                fxmlLoader = loader.load();

                DisplayController displayController = loader.getController();
                displayController.spect();

                //fxmlLoader = FXMLLoader.load(getClass().getResource("video-display.fxml"));
                primaryStage = (Stage) ((Node)event.getSource()).getScene().getWindow();
                scene = new Scene(fxmlLoader, 600, 400);
                scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
                primaryStage.setScene(scene);
                primaryStage.setTitle("Trailer");
                primaryStage.show();
        }

        public void transformers(ActionEvent event) throws IOException {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("video-display.fxml"));
                fxmlLoader = loader.load();

                DisplayController displayController = loader.getController();
                displayController.trans();

                //fxmlLoader = FXMLLoader.load(getClass().getResource("video-display.fxml"));
                primaryStage = (Stage) ((Node)event.getSource()).getScene().getWindow();
                scene = new Scene(fxmlLoader, 600, 400);
                scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
                primaryStage.setScene(scene);
                primaryStage.setTitle("Trailer");
                primaryStage.show();
        }

        public void venom(ActionEvent event) throws IOException {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("video-display.fxml"));
                fxmlLoader = loader.load();

                DisplayController displayController = loader.getController();
                displayController.ven();

                //fxmlLoader = FXMLLoader.load(getClass().getResource("video-display.fxml"));
                primaryStage = (Stage) ((Node)event.getSource()).getScene().getWindow();
                scene = new Scene(fxmlLoader, 600, 400);
                scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
                primaryStage.setScene(scene);
                primaryStage.setTitle("Trailer");
                primaryStage.show();
        }

        public void thinkTwice(ActionEvent event) throws IOException {
                //loading video-display fxml
                FXMLLoader loader = new FXMLLoader(getClass().getResource("video-display.fxml"));
                fxmlLoader = loader.load();

                //liking displayController controller
                DisplayController displayController = loader.getController();
                displayController.thought(); //calling trailer method from displayController. It contains trailer url

                /*fxmlLoader = FXMLLoader.load(getClass().getResource("video-display.fxml"));*/
                //Switch to video display scene
                primaryStage = (Stage) ((Node)event.getSource()).getScene().getWindow();
                scene = new Scene(fxmlLoader, 600, 400);
                scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
                primaryStage.setScene(scene);
                primaryStage.setTitle("Trailer");
                primaryStage.show();
        }

        public void underSkin(ActionEvent event) throws IOException {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("video-display.fxml"));
                fxmlLoader = loader.load();

                DisplayController displayController = loader.getController();
                displayController.theSkin();

                //fxmlLoader = FXMLLoader.load(getClass().getResource("video-display.fxml"));
                primaryStage = (Stage) ((Node)event.getSource()).getScene().getWindow();
                scene = new Scene(fxmlLoader, 600, 400);
                scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
                primaryStage.setScene(scene);
                primaryStage.setTitle("Trailer");
                primaryStage.show();
        }

        public void theEndless(ActionEvent event) throws IOException {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("video-display.fxml"));
                fxmlLoader = loader.load();

                DisplayController displayController = loader.getController();
                displayController.endless();

                //fxmlLoader = FXMLLoader.load(getClass().getResource("video-display.fxml"));
                primaryStage = (Stage) ((Node)event.getSource()).getScene().getWindow();
                scene = new Scene(fxmlLoader, 600, 400);
                scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
                primaryStage.setScene(scene);
                primaryStage.setTitle("Trailer");
                primaryStage.show();
        }

        public void snowPiercer(ActionEvent event) throws IOException {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("video-display.fxml"));
                fxmlLoader = loader.load();

                DisplayController displayController = loader.getController();
                displayController.snow();

                //fxmlLoader = FXMLLoader.load(getClass().getResource("video-display.fxml"));
                primaryStage = (Stage) ((Node)event.getSource()).getScene().getWindow();
                scene = new Scene(fxmlLoader, 600, 400);
                scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
                primaryStage.setScene(scene);
                primaryStage.setTitle("Trailer");
                primaryStage.show();
        }

        public void pacificRim(ActionEvent event) throws IOException {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("video-display.fxml"));
                fxmlLoader = loader.load();

                DisplayController displayController = loader.getController();
                displayController.pacific();

                //fxmlLoader = FXMLLoader.load(getClass().getResource("video-display.fxml"));
                primaryStage = (Stage) ((Node)event.getSource()).getScene().getWindow();
                scene = new Scene(fxmlLoader, 600, 400);
                scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
                primaryStage.setScene(scene);
                primaryStage.setTitle("Trailer");
                primaryStage.show();
        }

        public void colossal(ActionEvent event) throws IOException {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("video-display.fxml"));
                fxmlLoader = loader.load();

                DisplayController displayController = loader.getController();
                displayController.colo();

                //fxmlLoader = FXMLLoader.load(getClass().getResource("video-display.fxml"));
                primaryStage = (Stage) ((Node)event.getSource()).getScene().getWindow();
                scene = new Scene(fxmlLoader, 600, 400);
                scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
                primaryStage.setScene(scene);
                primaryStage.setTitle("Trailer");
                primaryStage.show();
        }

        public void blockAttack(ActionEvent event) throws IOException {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("video-display.fxml"));
                fxmlLoader = loader.load();

                DisplayController displayController = loader.getController();
                displayController.block();

                //fxmlLoader = FXMLLoader.load(getClass().getResource("video-display.fxml"));
                primaryStage = (Stage) ((Node)event.getSource()).getScene().getWindow();
                scene = new Scene(fxmlLoader, 600, 400);
                scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
                primaryStage.setScene(scene);
                primaryStage.setTitle("Trailer");
                primaryStage.show();
        }

        public void bladeRunner(ActionEvent event) throws IOException {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("video-display.fxml"));
                fxmlLoader = loader.load();

                DisplayController displayController = loader.getController();
                displayController.blade();

                //fxmlLoader = FXMLLoader.load(getClass().getResource("video-display.fxml"));
                primaryStage = (Stage) ((Node)event.getSource()).getScene().getWindow();
                scene = new Scene(fxmlLoader, 600, 400);
                scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
                primaryStage.setScene(scene);
                primaryStage.setTitle("Trailer");
                primaryStage.show();
        }

        public void Emma(ActionEvent event) throws IOException {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("video-display.fxml"));
                fxmlLoader = loader.load();

                DisplayController displayController = loader.getController();
                displayController.emma();

                //fxmlLoader = FXMLLoader.load(getClass().getResource("video-display.fxml"));
                primaryStage = (Stage) ((Node)event.getSource()).getScene().getWindow();
                scene = new Scene(fxmlLoader, 600, 400);
                scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
                primaryStage.setScene(scene);
                primaryStage.setTitle("Trailer");
                primaryStage.show();
        }
}