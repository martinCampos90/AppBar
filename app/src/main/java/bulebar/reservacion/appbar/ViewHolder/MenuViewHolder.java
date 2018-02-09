package bulebar.reservacion.appbar.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import bulebar.reservacion.appbar.Interface.ItemClickListener;
import bulebar.reservacion.appbar.R;

/**
 * Created by MDJ16 on 09/02/2018.
 */

public class MenuViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
    //Create menu_item for show layout of menu
    //and create MenuviewHolder to using with FireBaseUI
    public TextView txtMenuName;
    public ImageView imageView;

    private ItemClickListener itemClickListener;

    public MenuViewHolder(View itemView){
        super(itemView);
        txtMenuName = (TextView)itemView.findViewById(R.id.menu_name);
        imageView = (ImageView)itemView.findViewById(R.id.menu_image);

        itemView.setOnClickListener(this);
    }

    public void setItemClickListener(ItemClickListener itemClickListener){
        this.itemClickListener = itemClickListener;
    }


    @Override
    public void onClick(View view){
        itemClickListener.onClick(view,getAdapterPosition(),false);
    }

}
