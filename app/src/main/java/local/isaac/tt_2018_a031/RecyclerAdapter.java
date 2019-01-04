package local.isaac.tt_2018_a031;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {

    Context context;
    ArrayList<String> titulos;
    ArrayList<Integer> imagenes;
    LayoutInflater inflater;
    //private List<Movie> moviesList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title;
        public ImageView image;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.list_row_title);
            image = (ImageView) view.findViewById(R.id.list_row_image);
            //year = (TextView) view.findViewById(R.id.year);
        }
    }

/*
    public RecyclerAdapter(List<Movie> moviesList) {
        this.moviesList = moviesList;
    }
*/
    public RecyclerAdapter(Context context, ArrayList<String> titulos, ArrayList<Integer> imagenes) {
        this.context = context;
        this.titulos = titulos;
        this.imagenes = imagenes;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView = inflater.inflate(R.layout.list_row, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        //Movie movie = moviesList.get(position);
        holder.title.setText(titulos.get(position));
        //holder.genre.setText(movie.getGenre());
        holder.image.setImageResource(imagenes.get(position));
        //holder.year.setText(movie.getYear());
    }

    @Override
    public int getItemCount() {
        return titulos.size();
    }
}