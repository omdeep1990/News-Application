package com.omdeep.newsapplication;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Url;

public class CategoryRVAdapter extends RecyclerView.Adapter<CategoryRVAdapter.ViewHolder> {
  private ArrayList<CategoryRVModal> categoryRVModalArrayList;
  private Context context;
  private CategoryClickInterface categoryClickInterface;
//  ImageView imageView1,imageView2,imageView3,imageView4,imageView5,imageView6,imageView7;

    public CategoryRVAdapter(ArrayList<CategoryRVModal> categoryRVModals, Context context, CategoryClickInterface categoryClickInterface) {
        this.categoryRVModalArrayList = categoryRVModals;
        this.context = context;
        this.categoryClickInterface = categoryClickInterface;
    }

    @NonNull
    @Override
    public CategoryRVAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.categories_rv_item,parent,false);
        return new CategoryRVAdapter.ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull CategoryRVAdapter.ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        CategoryRVModal categoryRVModal = categoryRVModalArrayList.get(position);
        holder.categoryTV.setText(categoryRVModal.getCategory());
        //CategoryRVModal categoryRVModal1 = categoryRVModals.get(position);
        Picasso.get().load(categoryRVModal.getCategoryImageUrl()).into(holder.categoryIV);
//       Glide.with(context).load(categoryRVModals.get(position)).into(holder.categoryIV);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                categoryClickInterface.onCategoryClick(position);
            }
        });
    }




    @Override
    public int getItemCount() {
        return categoryRVModalArrayList.size();
    }

   public interface CategoryClickInterface{
        void onCategoryClick(int position);
   }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView categoryIV;
        private TextView categoryTV;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            categoryIV = itemView.findViewById(R.id.idIVCategory);
            categoryTV = itemView.findViewById(R.id.idTVCategory);

        }

    }
}
