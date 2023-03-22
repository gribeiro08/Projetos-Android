package br.pucpr.bradesco.basalanguagelearning.view;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import br.pucpr.bradesco.basalanguagelearning.R;
import br.pucpr.bradesco.basalanguagelearning.controller.Activity2;
import br.pucpr.bradesco.basalanguagelearning.controller.MainActivity;
import br.pucpr.bradesco.basalanguagelearning.model.DataStore;
import br.pucpr.bradesco.basalanguagelearning.model.Modelo;

public class ModeloAdapter extends RecyclerView.Adapter<ModeloAdapter.ModeloHolder> {

    private List<Modelo> modelos;
    private Context context;

    public ModeloAdapter(List<Modelo> modelos, Context context) {
        this.modelos = modelos;
        this.context = context;
    }

    @NonNull
    @Override
    public ModeloHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(
                R.layout.modelo,
                parent,
                false
        );
        return new ModeloHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ModeloHolder holder, int position) {

        Modelo modelo = modelos.get(position);

        holder.img_mod.setImageDrawable(modelo.getImage_mod());
        holder.txt_mod.setText(modelo.getText_mod());

        holder.linear_mod.setOnClickListener(View -> {
                    DataStore.sharedInstance().actualModel = holder.getAdapterPosition();
                    Intent intent = new Intent(context, Activity2.class);
                    context.startActivity(intent);
                }
                );

    }

    @Override
    public int getItemCount() {
        return modelos.size();
    }

    class ModeloHolder extends RecyclerView.ViewHolder {

        LinearLayout linear_mod;
        CardView card_mod;
        ImageView img_mod;
        TextView txt_mod;


        public ModeloHolder(@NonNull View itemView) {
            super(itemView);

            linear_mod = itemView.findViewById(R.id.linear_mod);
            card_mod = itemView.findViewById(R.id.card_mod);
            img_mod = itemView.findViewById(R.id.img_mod);
            txt_mod = itemView.findViewById(R.id.txt_mod);


        }
    }
}