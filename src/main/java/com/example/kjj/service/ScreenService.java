package com.example.kjj.service;

import com.example.kjj.HelloApplication;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

import java.io.IOException;

public class ScreenService {
    private ScreenService(){}
    private final static ScreenService instance = new ScreenService();

    public static ScreenService getInstance() {
        return instance;
    }

    private Scene main;

    public Scene getMain() {
        return main;
    }

    public ScreenService setMain(Scene main) {
        this.main = main;
        return this;
    }

    public void setView(String name) throws IOException {
        main.setRoot(
                new FXMLLoader(HelloApplication.class.getResource(name+".fxml")).load()
        );
    }
}
