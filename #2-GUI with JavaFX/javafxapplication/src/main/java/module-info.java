module com.javafxapplication {
    // Harus ada: meminta modul controls (tombol, label, dll)
    requires javafx.controls;
    // Harus ada: meminta modul FXML
    requires javafx.fxml;

    // Membuka package controller agar dapat diakses oleh FXML Loader
    opens com.javafxapplication to javafx.fxml;

    // Mengekspor package utama aplikasi
    exports com.javafxapplication;
}

