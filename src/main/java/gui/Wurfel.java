package gui;

import javafx.scene.transform.Rotate;
import javafx.scene.PerspectiveCamera;
import javafx.scene.transform.Translate;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.RectangleBuilder;
;


public class Wurfel extends Application {


    public class cub extends Group {
        final Rotate rx = new Rotate(0,Rotate.X_AXIS);
        final Rotate ry = new Rotate(0,Rotate.Y_AXIS);
        final Rotate rz = new Rotate(0,Rotate.Z_AXIS);
        public cub(double size, Color back,Color bottom,Color right,Color left,Color top,Color front, double shade) {
            getTransforms().addAll(rz, ry, rx);
            getChildren().addAll(
                    RectangleBuilder.create() //rückseite
                            .width(size).height(size)
                            .fill(back.deriveColor(0.0, 1.0, (1 - 0.5*shade), 1.0))
                            .translateX(-0.5*size)
                            .translateY(-0.5*size)
                            .translateZ(0.5*size)
                            .smooth(true)
                            .stroke(Color.BLACK)
                            .build(),
                    RectangleBuilder.create() //boden
                            .width(size).height(size)
                            .fill(bottom.deriveColor(0.0, 1.0, (1 - 0.4*shade), 1.0))
                            .translateX(-0.5*size)
                            .translateY(0)
                            .rotationAxis(Rotate.X_AXIS)
                            .rotate(90)
                            .smooth(true)
                            .stroke(Color.BLACK)
                            .build(),
                    RectangleBuilder.create() //rechte seite
                            .width(size).height(size)
                            .fill(right.deriveColor(0.0, 1.0, (1 - 0.3*shade), 1.0))
                            .translateX(-1*size)
                            .translateY(-0.5*size)
                            .rotationAxis(Rotate.Y_AXIS)
                            .rotate(90)
                            .smooth(true)
                            .stroke(Color.BLACK)
                            .build(),
                    RectangleBuilder.create() //linke seite
                            .width(size).height(size)
                            .fill(left.deriveColor(0.0, 1.0, (1 - 0.2*shade), 1.0))
                            .translateX(0)
                            .translateY(-0.5*size)
                            .rotationAxis(Rotate.Y_AXIS)
                            .rotate(90)
                            .smooth(true)
                            .stroke(Color.BLACK)
                            .build(),
                    RectangleBuilder.create() //oben
                            .width(size).height(size)
                            .fill(top.deriveColor(0.0, 1.0, (1 - 0.1*shade), 1.0))
                            .translateX(-0.5*size)
                            .translateY(-1*size)
                            .rotationAxis(Rotate.X_AXIS)
                            .rotate(90)
                            .smooth(true)
                            .stroke(Color.BLACK)
                            .build(),
                    RectangleBuilder.create() //vorne
                            .width(size).height(size)
                            .fill(front)
                            .translateX(-0.5*size)
                            .translateY(-0.5*size)
                            .translateZ(-0.5*size)
                            .smooth(true)
                            .stroke(Color.BLACK)
                            .build()
            );
        }
    }



    PerspectiveCamera camera = new PerspectiveCamera(true);
    @Override public void start(Stage primaryStage) throws Exception {

        Group root = new Group();
        Scene scene=new Scene(root,1000,1000,true);

        camera.setFarClip(10000000.0);

        camera.getTransforms().addAll (
                new Rotate(0, Rotate.Y_AXIS),
                new Rotate(0, Rotate.X_AXIS),

                new Translate(75, 0, -750));
        scene.setCamera(camera);
        cub c1 = new cub(50,Color.BLUE.darker(),Color.BLUE.darker(),Color.ORANGE.darker(),Color.BLUE.darker(),Color.BLUE.darker(),Color.RED.darker(),1);
        c1.setTranslateX(100);

        cub c2 = new cub(50,Color.GREEN.darker(),Color.GREEN.darker(),Color.GREEN.darker(),Color.YELLOW.darker(),Color.BLUE.darker(),Color.RED.darker(),1);
        c2.setTranslateX(50);

        cub c3 = new cub(50,Color.YELLOW.brighter(),Color.GREEN.darker(),Color.GREEN.darker(),Color.YELLOW.darker(),Color.BLUE.darker(),Color.RED.darker(),1);
        c3.setTranslateX(50);
        c3.setTranslateZ(50);

        cub c4 = new cub(50,Color.YELLOW.brighter(),Color.GREEN.darker(),Color.ORANGE.darker(),Color.YELLOW.darker(),Color.BLUE.darker(),Color.RED.darker(),1);
        c4.setTranslateX(100);
        c4.setTranslateZ(50);

        cub c5 = new cub(50,Color.BLUE.darker(),Color.GREEN.darker(),Color.ORANGE.darker(),Color.BLUE.darker(),Color.BLUE.darker(),Color.RED.darker(),1);
        c5.setTranslateX(100);
        c5.setTranslateY(50);

        cub c6 = new cub(50,Color.GREEN.darker(),Color.GREEN.darker(),Color.GREEN.darker(),Color.YELLOW.darker(),Color.BLUE.darker(),Color.RED.darker(),1);
        c6.setTranslateX(50);
        c6.setTranslateY(50);

        cub c7 = new cub(50,Color.YELLOW.brighter(),Color.GREEN.darker(),Color.GREEN.darker(),Color.YELLOW.darker(),Color.BLUE.darker(),Color.RED.darker(),1);
        c7.setTranslateX(50);
        c7.setTranslateZ(50);
        c7.setTranslateY(50);

        cub c8 = new cub(50,Color.YELLOW.brighter(),Color.GREEN.darker(),Color.ORANGE.darker(),Color.YELLOW.darker(),Color.BLUE.darker(),Color.RED.darker(),1);
        c8.setTranslateX(100);
        c8.setTranslateZ(50);
        c8.setTranslateY(50);
        handleMouse(scene,root);
        Group k=new Group(c1,c2,c3,c4,c5,c6,c7,c8);
        k.setTranslateZ(70);
        root.getChildren().addAll(k);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) { launch(args); }
    private static final double CONTROL_MULTIPLIER = 0.1;
    private static final double SHIFT_MULTIPLIER = 10.0;
    private static final double MOUSE_SPEED = 0.1;
    private static final double ROTATION_SPEED = 1.0;
    double mousePosX,mousePosY,mouseOldX,mouseOldY,mouseDeltaX,mouseDeltaY;
    private void handleMouse(Scene scene, final Node root) {


        scene.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override public void handle(MouseEvent me) {
                mousePosX = me.getSceneX();
                mousePosY = me.getSceneY();
                mouseOldX = me.getSceneX();
                mouseOldY = me.getSceneY();
            }
        });
        scene.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override public void handle(MouseEvent me) {
                mouseOldX = mousePosX;
                mouseOldY = mousePosY;
                mousePosX = me.getSceneX();
                mousePosY = me.getSceneY();
                mouseDeltaX = (mousePosX - mouseOldX);
                mouseDeltaY = (mousePosY - mouseOldY);

                double modifier = 1.0;

                if (me.isControlDown()) {
                    modifier = CONTROL_MULTIPLIER;
                }
                if (me.isShiftDown()) {
                    modifier = SHIFT_MULTIPLIER;
                }
                if (me.isPrimaryButtonDown()) {
                    camera.setRotationAxis(Rotate.Y_AXIS);camera.setRotate(camera.getRotate() -
                            mouseDeltaX*modifier*ROTATION_SPEED);  //
                    camera.setRotationAxis(Rotate.X_AXIS);camera.setRotate(camera.getRotate() +
                            mouseDeltaY*modifier*ROTATION_SPEED);  // -

                }
                else if (me.isSecondaryButtonDown()) {
                    double z = camera.getTranslateZ();
                    double newZ = z + mouseDeltaX*MOUSE_SPEED*modifier;
                    camera.setTranslateZ(newZ);
                }

            }
        });
    }
}