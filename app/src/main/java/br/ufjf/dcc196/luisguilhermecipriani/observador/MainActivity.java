package br.ufjf.dcc196.luisguilhermecipriani.observador;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AvistamentoAdapter.OnAvistamentoClickListener {
    private RecyclerView recyclerViewAvistamentos;
    private List<Avistamento> avistamentos;
    private LinearLayoutManager layoutManager;
    private AvistamentoAdapter avistamentoAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        avistamentos = new ArrayList<Avistamento>(){{
            add(new Avistamento("Bem-te-vi", "Pitangus sulphuratus", 0));
            add(new Avistamento("Martinho Pescador", "Megaceryle torquata", 1));
            add(new Avistamento("João de Barro", "Furnarius rufus", 3));add(new Avistamento("Bem-te-vi", "Pitangus sulphuratus", 0));
            add(new Avistamento("Martinho Pescador", "Megaceryle torquata", 1));
            add(new Avistamento("João de Barro", "Furnarius rufus", 3));add(new Avistamento("Bem-te-vi", "Pitangus sulphuratus", 0));
            add(new Avistamento("Martinho Pescador", "Megaceryle torquata", 1));
            add(new Avistamento("João de Barro", "Furnarius rufus", 3));
        }};

        recyclerViewAvistamentos = findViewById(R.id.recyclerViewAvistamentos);
        layoutManager = new LinearLayoutManager(this);
        recyclerViewAvistamentos.setLayoutManager(layoutManager);
        avistamentoAdapter = new AvistamentoAdapter(avistamentos, this);
        recyclerViewAvistamentos.setAdapter(avistamentoAdapter);
    }

    @Override
    public void onAvistamentoClick(View source, int position) {
        avistamentos.get(position).incrementa();
        avistamentoAdapter.notifyItemChanged(position);
        Toast.makeText(this, "CLICK" + position, Toast.LENGTH_SHORT).show();
    }
}