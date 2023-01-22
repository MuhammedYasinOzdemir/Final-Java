package com.example.q;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class OtelContrroller {
   private static int[][] aileler=new int[3][6];
   @FXML
    RadioButton family_radio;
   @FXML
   RadioButton deluxe_radio;
   @FXML
   RadioButton king_radio;
   @FXML
   TextField yetiskin_text;
   @FXML
   TextField cocuk_text;
   @FXML
   TextField tatil_sure;


    public OtelContrroller() {
        aileler= new int[][]{{10, 5, 6, 3, 2, 1}, {12, 6, 8, 4, 4, 2}, {14, 7, 10, 5, 6, 3}};

    }
    @FXML
    public void tutarHesapla(){
        int yetiskin=Integer.parseInt(yetiskin_text.getText());
        int cocuk=Integer.parseInt(cocuk_text.getText());
        int gece=Integer.parseInt(tatil_sure.getText());
        int t=0;
        for(int i=0;i<aileler.length;i++){
            for(int j=0;j<aileler[i].length;i++){
                t+=yetiskin*gece;
                t+=cocuk*gece;
            }
        }
        System.out.println(t);
    }
}
