package com.example.th2_bai3.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.th2_bai3.R;
import com.example.th2_bai3.model.Book;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.HomeViewHolder> {
    private List<Book> list;
    private ItemListener itemListener;
    public RecyclerViewAdapter() {
        list=new ArrayList<>();
    }

    public void setList(List<Book> list) {
        this.list = list;
        notifyDataSetChanged();
    }
    public Book getItem(int position){
        return list.get(position);

    }
    public void setItemListener(ItemListener itemListener) {
        this.itemListener = itemListener;
    }
    @NonNull
    @Override
    public HomeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycler_view,parent,false);
        return new HomeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HomeViewHolder holder, int position) {
        Book book= list.get(position);
        holder.tvName.setText(book.getName());
        holder.tvAuthor.setText(book.getAuthor());
        holder.tvPublishDate.setText(book.getReleaseDate());
        holder.tvPublisher.setText(book.getPublisher());
        holder.tvPrice.setText(book.getPrice());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class HomeViewHolder extends RecyclerView.ViewHolder  implements View.OnClickListener{
        private TextView tvName, tvAuthor, tvPublishDate, tvPublisher, tvPrice;
        public HomeViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tvTen);
            tvAuthor = itemView.findViewById(R.id.tvTacGia);
            tvPublishDate = itemView.findViewById(R.id.tvNgayXB);
            tvPublisher = itemView.findViewById(R.id.tvNhaXB);
            tvPrice = itemView.findViewById(R.id.tvGia);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            if(itemListener!=null){
                itemListener.onItemClick(view,getAdapterPosition());
            }
        }
    }
    public interface ItemListener{
        void onItemClick (View view,int position);
    }
}
