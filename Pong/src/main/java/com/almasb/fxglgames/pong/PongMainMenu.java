package com.almasb.fxglgames.pong;

import com.almasb.fxgl.app.scene.FXGLMenu;
import com.almasb.fxgl.app.scene.MenuType;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import static com.almasb.fxgl.dsl.FXGL.*;

public class PongMainMenu extends FXGLMenu {

    public PongMainMenu() {
        super(MenuType.MAIN_MENU);

        getContentRoot().getChildren().setAll(new Rectangle(getAppWidth(), getAppHeight()));

        var title = getUIFactoryService().newText(getSettings().getTitle(), Color.WHITE, 46.0);
        title.setStroke(Color.WHITESMOKE);
        title.setStrokeWidth(1.5);

        Button newGameButton = new Button("New Game");
        newGameButton.setOnAction(action -> fireNewGame());

        Button exitButton = new Button("Exit Game");
        exitButton.setOnAction(action -> fireExit());

        VBox vbox = new VBox(title, newGameButton, exitButton);
        vbox.setAlignment(Pos.BASELINE_CENTER);
        vbox.setSpacing(10);
        vbox.setTranslateX(getAppWidth() / 2. - vbox.getWidth() / 2.);
        vbox.setTranslateY(200.);

        getContentRoot().getChildren().addAll(vbox);
    }
}
