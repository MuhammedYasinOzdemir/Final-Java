
package com.example.honoi;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Honoi extends Application {
    private static final int NUM_DISKS = 3; // Oyunda kullanılacak disk sayısı
    private static final String[] COLUMN_NAMES = {"A", "B", "C"}; // Direklerin isimleri

    private Image[] diskImages; // Diskleri göstermek için kullanılan resim dosyaları
    private ImageView[][] disks; // Oyunda kullanılacak diskler
    private Button[][] buttons; // Direkler arasında disklerin taşınmasını sağlayan butonlar

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Diskleri göstermek için kullanılacak resim dosyalarını yükle
        diskImages = new Image[NUM_DISKS];
        for (int i = 0; i < NUM_DISKS; i++) {
            diskImages[i] = new Image("disk" + (i + 1) + ".png");
        }

        // Oyunda kullanılacak diskleri oluştur
        disks = new ImageView[NUM_DISKS][COLUMN_NAMES.length];
        for (int i = 0; i < NUM_DISKS; i++) {
            for (int j = 0; j < COLUMN_NAMES.length; j++) {

                disks[i][j] = new ImageView();
                disks[i][j].setFitHeight(50); // Disklerin yüksekliğini ayarla
                disks[i][j].setPreserveRatio(true); // Oranı koru
            }
        }
        // Direkler arasında disklerin taşınmasını sağlayan butonları oluştur
        buttons = new Button[COLUMN_NAMES.length][COLUMN_NAMES.length];
        for (int i = 0; i < COLUMN_NAMES.length; i++) {
            for (int j = 0; j < COLUMN_NAMES.length; j++) {
                if (i != j) { // Aynı direk için buton oluşturulmaz
                    buttons[i][j] = new Button();
                    final int fromColumn = i;
                    final int toColumn = j;
                    buttons[i][j].setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent event) {
                            // Disklerin taşınmasını sağlayan metodu çağır
                            moveDisk(fromColumn, toColumn);
                        }
                    });
                }
            }
        }

        // Arayüz elemanlarını bir "GridPane" layout sınıfı içinde düzenle
        GridPane root = new GridPane();
        for (int i = 0; i < COLUMN_NAMES.length; i++) {
            root.add(new Label(COLUMN_NAMES[i]), i, 0); // Direk isimlerini göster
            for (int j = 0; j < NUM_DISKS; j++) {
                root.add(disks[j][i], i, j + 1); // Diskleri göster
            }
            for (int j = 0; j < COLUMN_NAMES.length; j++) {
                if (i != j) { // Aynı direk için buton eklenmez
                    root.add(buttons[i][j], i, NUM_DISKS + j + 1); // Butonları göster
                }
            }
        }

        // Oluşturulan arayüzü "Scene" nesnesi içinde göster
        Scene scene = new Scene(root, 300, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void moveDisk(int fromColumn, int toColumn) {
        // Geçerli hamle, oyun kurallarına uygun mu?
        if (!isValidMove(fromColumn, toColumn)) {
            return;
        }

        // Geçerli hamle, oyun kurallarına uygundur
        // Diskleri taşı
        for (int i = NUM_DISKS - 1; i >= 0; i--) {
            if (disks[i][fromColumn].getImage() != null) { // Taşınacak disk bulundu

                ImageView disk = disks[i][fromColumn];
                disks[i][fromColumn].setImage(null); // Diski kaynak direkten kaldır
                int toRow = getTopEmptyRow(toColumn); // Hedef direkteki boş satırı bul
                disks[toRow][toColumn].setImage(disk.getImage()); // Diski hedef direğe ekle
                break;
            }
        }
    }

    // Geçerli hamle, oyun kurallarına uygun mu?
    private boolean isValidMove(int fromColumn, int toColumn) {
        // Kaynak ve hedef direkler aynı mı?
        if (fromColumn == toColumn) {
            return false;
        }

        // Kaynak direkte hiç disk yoksa geçersiz hamle
        int topDiskRow = getTopDiskRow(fromColumn);
        if (topDiskRow == -1) {
            return false;
        }

        // Hedef direkteki en üstteki disk, kaynak direkteki en üstteki diskten daha büyükse geçersiz hamle
        int topEmptyRow = getTopEmptyRow(toColumn);
        if (topEmptyRow < NUM_DISKS - 1 && disks[topEmptyRow + 1][toColumn].getImage() != null &&
                diskImages[NUM_DISKS - 1 - topDiskRow].getWidth() > diskImages[NUM_DISKS - 1 - topEmptyRow].getWidth()) {
            return false;
        }

        return true;
    }

    // Verilen direkteki en üstteki boş satırı döndürür
    private int getTopEmptyRow(int column) {
        for (int i = 0; i < NUM_DISKS; i++) {
            if (disks[i][column].getImage() == null) {
                return i;
            }
        }
        return -1;
    }

    // Verilen direkteki en üstteki disk satırını döndürür
    private int getTopDiskRow(int column) {
        for (int i = NUM_DISKS - 1; i >= 0; i--) {
            if (disks[i][column].getImage() != null) {
                return i;
            }
        }
        return -1;
    }
}