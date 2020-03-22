package tw.org.iii.ellen.ellen18;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class F1 extends Fragment {

    private TextView lottery ;
    private View view ;
    private MainActivity mainActivity ;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if (view == null) {
            view = inflater.inflate(R.layout.fragment_f1, container, false);
            Button test1 = view.findViewById(R.id.page1_test1);
            lottery = view.findViewById(R.id.page1_lottery);

            test1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //Log.v("ellen","Page1_test1()") ;
                    lottery.setText("");
                    showLottery();
                }
            });

            view.findViewById(R.id.page1_test2).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mainActivity.changeTitle("哈囉世界");
                }
            });
        }
        return view ;
    }

    public void showLottery(){
        lottery.setText(""+(int)(Math.random()*49+1)) ;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context) ;
        mainActivity = (MainActivity)context ;
    }
}
