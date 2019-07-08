package com.example.attendancetaking;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class BatchAdapter extends RecyclerView.Adapter<BatchAdapter.ViewHolder> {

    private Context context;
    private List<Batch> batches;

    public BatchAdapter(Context context, List batches) {
        this.context = context;
        this.batches = batches;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_batch_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {


       Batch mb = batches.get(position);

       holder.batchname.setText(mb.getName());
//        holder.itemView.setTag(.get(position));

    }

    @Override
    public int getItemCount() {
        return batches.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView batchname;

        public ViewHolder(View itemView) {
            super(itemView);
                batchname = (TextView) itemView.findViewById(R.id.tv_batch_name);
        }
    }

}