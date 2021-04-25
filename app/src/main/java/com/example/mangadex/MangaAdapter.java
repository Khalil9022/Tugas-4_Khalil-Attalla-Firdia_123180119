package com.example.mangadex;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class MangaAdapter extends RecyclerView.Adapter<MangaAdapter.ViewHolder> {

    public ArrayList<MangaModel> getMangaModels() {
        return mangaModels;
    }

    public void setMangaModels(ArrayList<MangaModel> mangaModels) {
        this.mangaModels = mangaModels;
    }

    public MangaAdapter(ArrayList<MangaModel> listData, Context context) {
        this.context = context;
    }

    public ArrayList<MangaModel> mangaModels;
    private Context context;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_manga, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int i) {
        Glide.with(context).load(getMangaModels().get(i).getGambarManga()).into(holder.photo);
        holder.tvName.setText(getMangaModels().get(i).getNamaManga());
        holder.tvdeskripsi.setText(getMangaModels().get(i).getDetailManga());
        holder.cvCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("photo", getMangaModels().get(i).getGambarManga());
                intent.putExtra("name", getMangaModels().get(i).getNamaManga());
                intent.putExtra("detail", getMangaModels().get(i).getDetailManga());
                intent.putExtra("status", getMangaModels().get(i).getStatusManga());
                context.startActivities(new Intent[]{intent});
            }
        });
    }

    @Override
    public int getItemCount() {
        return mangaModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView photo ;
        private TextView tvName,tvdeskripsi;
        private CardView cvCardView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            photo = itemView.findViewById(R.id.ivphoto);
            tvName = itemView.findViewById(R.id.tvname);
            cvCardView = itemView.findViewById(R.id.cv_item);
            tvdeskripsi = itemView.findViewById(R.id.tvdetail);
        }
    }
}
