package br.ufjf.dcc196.luisguilhermecipriani.observador;

import android.content.Context;
import android.net.sip.SipSession;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class AvistamentoAdapter extends RecyclerView.Adapter<AvistamentoAdapter.AvistamentoViewHolder> {
    private final List<Avistamento> avistamentos;
    private OnAvistamentoClickListener listener;

    public AvistamentoAdapter(List<Avistamento> avistamentos, OnAvistamentoClickListener listener) {
        this.avistamentos = avistamentos;
        this.listener = listener;
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
        public AvistamentoViewHolder(@NonNull final View itemView) {
            super(itemView);
            textViewNome = itemView.findViewById(R.id.textViewNome);
            textViewEspecie = itemView.findViewById(R.id.textViewEspecie);
            textViewAvistamentos= itemView.findViewById(R.id.textViewAvistamentos);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onAvistamentoClick(itemView, getAdapterPosition());
                }
            });
        }
    }

    public interface OnAvistamentoClickListener{
        void onAvistamentoClick(View source, int position);
    }
}
