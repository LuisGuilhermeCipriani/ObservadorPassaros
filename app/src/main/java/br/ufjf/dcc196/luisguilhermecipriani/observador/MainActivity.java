package br.ufjf.dcc196.luisguilhermecipriani.observador;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerViewAvistamentos;
    List<Avistamento> avistamentos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        avistamentos = new ArrayList<Avistamento>(){{
            add(new Avistamento("Bem-te-vi", "Pitangus sulphuratus", 0));
            add(new Avistamento("Martinho Pescador", "Megaceryle torquata", 1));
            add(new Avistamento("João de Barro", "Furnarius rufus", 3));
        }};

        recyclerViewAvistamentos = findViewById(R.id.recyclerViewAvistamentos);
    }
}