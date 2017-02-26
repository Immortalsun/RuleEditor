package UX.ViewModel;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

//Rules start on page 769 in core rulebook pdf.
public class MainController {

    //Elements
    public TextField textField;

    @FXML
    public void UpdateText(Event event) {
        KeyEvent key = (KeyEvent)event;
        String textFieldText = textField.getText();
        if(!StringIsNullOrEmpty(key.getText())){
            textFieldText+=key.getText();
        }
        System.out.println(textFieldText);
    }

    private boolean StringIsNullOrEmpty(String s){
        return s.equals("") || s.equals(null);
    }
}
