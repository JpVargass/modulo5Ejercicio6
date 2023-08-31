package cl.jpvs.modulo5ejercicio6;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

import cl.jpvs.modulo5ejercicio6.databinding.ItemBinding;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    private List<Fotos> foto = new ArrayList<>();
    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemBinding binding = ItemBinding.inflate(LayoutInflater.from(parent.getContext()));
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
        Fotos item = foto.get(position);
        holder.bind(item);
    }

    @Override
    public int getItemCount() {
        return  foto.size(); }

    public void setFoto(List<Fotos> item) {
     this.foto = item;
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
    private ItemBinding binding;
      public ViewHolder(ItemBinding binding) {
          super(binding.getRoot());
          this.binding = binding;
          itemView.setOnClickListener(this);
      }
      public void bind(Fotos foto) {
       binding.tVPrimerf.setText(foto.text);
      Glide.with(binding.getRoot()).load(foto.url).into(binding.iVPrimerf);
      }
        @Override
        public void onClick(View v) {
            int position = getLayoutPosition();
            String imageUrl = String.valueOf(foto.get(position).getUrl());
            String imageText = String.valueOf(foto.get(position).getText());
            Bundle bundle = new Bundle();
            bundle.putString("url", imageUrl);
            bundle.putString("text", imageText);
            Navigation.findNavController(binding.getRoot()).navigate(R.id.action_primerFragment_to_segundoFragment, bundle);
        }
    }
}