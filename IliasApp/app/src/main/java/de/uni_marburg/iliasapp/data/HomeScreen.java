package de.uni_marburg.iliasapp.data;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.view.View;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import de.uni_marburg.iliasapp.MainActivity;
import de.uni_marburg.iliasapp.MeineVeranstaltungen;
import de.uni_marburg.iliasapp.Modul;
import de.uni_marburg.iliasapp.R;
import de.uni_marburg.iliasapp.Raumsuche;

public class HomeScreen extends AppCompatActivity {

    public static ArrayList<Modul> modulListe = new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homescreen);

        AssetManager assetManager = getAssets();

    }

    /**
     * Generates a Modul instance
     */
    public Modul makeModul(String id, String name, String form, String semester, String tag, String von, String bis, String raum, String dozent) {
        return new Modul(id, name, form, semester, tag, von, bis, raum, dozent);
    }

    public void buttonVeranstaltungsplan(View view) {


        //Starte Veranstaltungsplan (Main Activity)
        Intent veranstaltungsplanClass = new Intent(this, MainActivity.class);

        startActivity(veranstaltungsplanClass);
    }

    public void buttonRaumplan(View view) {
        // Startet Raumsuche (Raumsuche)
        Intent raumsuche = new Intent(this, Raumsuche.class);
        startActivity(raumsuche);
    }

    public void buttonmVeranstaltungen(View view) {
        //Starte Veranstaltungsplan (Main Activity)
        Intent meineVeranstaltungsplanClass = new Intent(this, MeineVeranstaltungen.class);


        startActivity(meineVeranstaltungsplanClass);
    }
}