package br.ufjf.dcc196.luisguilhermecipriani.observador;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class AvistamentoAdapter extends RecyclerView.Adapter<AvistamentoAdapter.AvistamentoViewHolder> {
    private final List<Avistamento> avistamentos;

    public AvistamentoAdapter(List<Avistamento> avistamentos) {
        this.avistamentos = avistamentos;
    }

    @NonNull
    @Override
    public AvistamentoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context ctx = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(ctx);
        View avistamentoView = inflater.inflate(R.layout.avistamento_layout, parent, false);
        AvistamentoViewHolder viewHolder = new AvistamentoViewHolder(avistamentoView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull AvistamentoViewHolder holder, int position) {
        holder.textViewNome.setText(avistamentos.get(position).getNome());
        holder.textViewEspecie.setText(avistamentos.get(position).getEspecie());
        holder.textViewAvistamentos.setText(avistamentos.get(position).getAvistamentos().toString());
    }

    @Override
    public int getItemCount() {
        return avistamentos.size();
    }

    public class AvistamentoViewHolder extends RecyclerView.ViewHolder {
        private TextView textViewNome;
        private TextView textViewEspecie;
        private TextView textViewAvistamentos;
        public AvistamentoViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewNome = itemView.findViewById(R.id.textViewNome);
            textViewEspecie = itemView.findViewById(R.id.textViewEspecie);
            textViewAvistamentos= itemView.findViewById(R.id.textViewAvistamentos);
        }
    }
}
