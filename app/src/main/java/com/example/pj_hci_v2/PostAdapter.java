package com.example.pj_hci_v2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.ViewHolder> {

    private ArrayList<Post> postList;
    private IClick iClick;

    public PostAdapter(ArrayList<Post> postList, IClick iClick) {
        this.postList = postList;
        this.iClick = iClick;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        Context context = parent.getContext();

        LayoutInflater layoutInflater = LayoutInflater.from(context);

        View view = layoutInflater.inflate(R.layout.post,parent,false);

        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {


        Post post = postList.get(position);

        holder.hinhUser.setImageResource(post.getHinhUser());
        holder.hinhDoVat.setImageResource(post.getHinhitem());
        holder.name.setText(post.getName());
        holder.time.setText(post.getTime());
//        holder.decription.setText(post.getDecription());
//        holder.nubLike.setText(post.getNubLike());
//        holder.nubComment.setText(post.getNubComment());
//        holder.nubShare.setText(post.getNubShare());
//        holder.Like.setText("Like");
//        holder.Comment.setText("Comment");
//        holder.Share.setText("Share");
        holder.baCham.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iClick.onClickItem();
            }
        });


    }

    @Override
    public int getItemCount() {
        return postList.size();
    }

    public  class ViewHolder extends RecyclerView.ViewHolder{
        ImageView hinhUser,hinhDoVat;
        TextView name;
        TextView time;
        TextView decription;
        TextView nubLike;
        TextView nubComment;
        TextView nubShare;
        Button Like;
        Button Share;
        Button Comment;
        ImageView baCham;




        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            hinhUser = itemView.findViewById(R.id.hinhUser);
            hinhDoVat = itemView.findViewById(R.id.hinhDoVat);
            name = itemView.findViewById(R.id.name);
            time = itemView.findViewById(R.id.time);
            decription = itemView.findViewById(R.id.decription);
            nubLike = itemView.findViewById(R.id.numberLike);
            nubComment = itemView.findViewById(R.id.numberComment);
            nubShare = itemView.findViewById(R.id.numberShare);
            Like = itemView.findViewById(R.id.buttonLike);
            Comment = itemView.findViewById(R.id.buttonComment);
            Share = itemView.findViewById(R.id.buttonShare);
            baCham = itemView.findViewById(R.id.baCham);




        }
    }

}
