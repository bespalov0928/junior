module tictactoe {
    requires javafx.fxml;
    requires javafx.controls;
    opens job4j.tictactoe to javafx.fxml;
    exports ru.job4j.tictactoe;
}