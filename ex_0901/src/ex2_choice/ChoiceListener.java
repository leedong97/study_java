package ex2_choice;

import java.awt.Label;
import java.awt.event.ItemListener;

public class ChoiceListener implements ItemListener{

    // private Choice area;
    private Label resLabel;

    public ChoiceListener(Label resLabel){
        // this.area = area;
        this.resLabel = resLabel;
    }

    @Override
    public void itemStateChanged(java.awt.event.ItemEvent e) {
       
        String str= (String)e.getItem();

        //String str= area.getSelectedItem();

        if(!str.equals("지역선택")){
            resLabel.setText(str+"을(를) 선택");
        }else{
            resLabel.setText("");
        }
    }
}
