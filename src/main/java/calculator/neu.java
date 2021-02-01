package calculator;


//notwendige importierungen
import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.beans.property.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import java.util.HashMap;
import java.util.Map;



// reihenfolger der elemente
public class neu extends Application {
    private static final String[][] template = {
            { "0", "1", "2", "3" },
            { "4", "5", "6", "7" },
            { "8", "9", "+", "-" },
            { "*", "/", "√", "%" },
            { "²", "c", "="}
    };
// variablen definierung
    private final Map<String, Button> accelerators = new HashMap<>();

    private DoubleProperty stackValue = new SimpleDoubleProperty();
    private DoubleProperty value = new SimpleDoubleProperty();

    private enum Op { NOOP, ADD, SUBTRACT, MULTIPLY, DIVIDE, ROOT, PERCENT, POTENCY}

    private Op curOp   = Op.NOOP;
    private Op stackOp = Op.NOOP;

    public static void main(String[] args) { launch(args); }

    @Override public void start(Stage stage) {
        final TextField screen  = createScreen();
        final TilePane  buttons = createButtons();
// szene darstellung + grafische darstellung
        stage.setTitle("Taschenrechner");
        stage.initStyle(StageStyle.UTILITY);
        stage.setResizable(false);
        stage.setScene(new Scene(createLayout(screen, buttons)));
        stage.show();
        stage.setMinHeight(250);
        stage.setMinWidth(350);


    }
// erstellung layout bzw. box außenrum
    private VBox createLayout(TextField screen, TilePane buttons) {
        final VBox layout = new VBox(20);
        layout.setPadding(new Insets(10,10,10,10));
        layout.setAlignment(Pos.CENTER);
        layout.getChildren().setAll(screen, buttons);
        screen.prefWidthProperty().bind(buttons.widthProperty());
        return layout;
    }

// erstellung layout
    private TextField createScreen() {
        final TextField screen = new TextField();
        screen.setAlignment(Pos.CENTER_RIGHT);
        screen.setEditable(false);
        screen.textProperty().bind(Bindings.format("%.0f", value));
        return screen;
    }
    // erstellung buttons
    private TilePane createButtons() {
        TilePane buttons = new TilePane();
        buttons.setVgap(7);
        buttons.setHgap(7);
        buttons.setPrefColumns(template[0].length);
        for (String[] r: template) {
            for (String s: r) {
                buttons.getChildren().add(createButton(s));
            }
        }
        return buttons;
    }
// erstellung standardbutton design
    private Button createButton(final String s) {
        Button button = makeStandardButton(s);

        if (s.matches("[0-9]")) {
            makeNumericButton(s, button);
        } else {
            final ObjectProperty<Op> trigger = determineOperand(s);
            if (trigger.get() != Op.NOOP) {
                makeOperandButton(button, trigger);
            } else if ("c".equals(s)) {
                makeClearButton(button);
            } else if ("=".equals(s)) {
                makeEqualsButton(button);
            }
        }

        return button;
    }
// wenn was ausgewählt wird, was dann folgt ->  trigger
    private ObjectProperty<Op> determineOperand(String s) {
        final ObjectProperty<Op> trigger = new SimpleObjectProperty<>(Op.NOOP);
        switch (s) {
            case "+": trigger.set(Op.ADD); break;
            case "-": trigger.set(Op.SUBTRACT); break;
            case "*": trigger.set(Op.MULTIPLY); break;
            case "/": trigger.set(Op.DIVIDE); break;
            case "√": trigger.set(Op.ROOT); break;
            case "%": trigger.set(Op.PERCENT); break;
            case "²": trigger.set(Op.POTENCY); break;

        }
        return trigger;
    }

    private void makeOperandButton(Button button, final ObjectProperty<Op> trigger) {
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                curOp = trigger.get();
            }
        });
    }
// design standardbutton
    private Button makeStandardButton(String s) {
        Button button = new Button(s);
        accelerators.put(s, button);
        button.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        return button;
    }
// button für zahlen
    private void makeNumericButton(final String s, Button button) {
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if (curOp == Op.NOOP) {
                    value.set(value.get() * 10 + Integer.parseInt(s));
                } else {
                    stackValue.set(value.get());
                    value.set(Integer.parseInt(s));
                    stackOp = curOp;
                    curOp = Op.NOOP;
                }
            }
        });
    }
// c button
    private void makeClearButton(Button button) {
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                value.set(0);
            }
        });
    }
// = button
    private void makeEqualsButton(Button button) {
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            // rechnungen ausführung
            public void handle(ActionEvent actionEvent) {
                switch (stackOp) {
                    case ADD:      value.set(stackValue.get() + value.get());        break;
                    case SUBTRACT: value.set(stackValue.get() - value.get());        break;
                    case MULTIPLY: value.set(stackValue.get() * value.get());        break;
                    case DIVIDE:   value.set(stackValue.get() / value.get());        break;
                    case ROOT:     value.set(Math.sqrt(stackValue.get()));           break;
                    case PERCENT:  value.set((stackValue.get() * 100)/ value.get()); break;
                    case POTENCY:  value.set(stackValue.get() * stackValue.get());   break;

                }
            }
        });
    }
}