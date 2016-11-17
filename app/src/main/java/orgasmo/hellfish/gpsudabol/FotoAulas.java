package orgasmo.hellfish.gpsudabol;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class FotoAulas extends AppCompatActivity {

    private ImageView fondo;
    private TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foto_aulas);
        fondo = (ImageView) findViewById(R.id.fondo);
        texto = (TextView)findViewById(R.id.text);
        Intent i = getIntent();
        Bundle extras = i.getExtras();
        if(extras != null){
            String a = (String) extras.get("id");
            texto.setText(a);

            switch (a){
                case "a1":
                    fondo.setImageResource(R.drawable.aulaa1);
                    break;
                case "a2":
                    fondo.setImageResource(R.drawable.aulaa2);
                    break;
                case "c1":
                    fondo.setImageResource(R.drawable.aulac1);
                    break;
                case "c2":
                    fondo.setImageResource(R.drawable.aulac2);
                    break;
                case "c3":
                    fondo.setImageResource(R.drawable.aulac3);
                    break;
                case "c4":
                    fondo.setImageResource(R.drawable.aulac4);
                    break;
                case "cc1":
                    fondo.setImageResource(R.drawable.aulacc1);
                    break;
                case "cc2":
                    fondo.setImageResource(R.drawable.aulacc2);
                    break;
                case "cc3":
                    fondo.setImageResource(R.drawable.aulacc3);
                    break;
                case "cc4":
                    fondo.setImageResource(R.drawable.aulacc4);
                    break;
                case "d1":
                    fondo.setImageResource(R.drawable.aulad1);
                    break;
                case "d2":
                    fondo.setImageResource(R.drawable.aulad2);
                    break;
                case "d3":
                    fondo.setImageResource(R.drawable.aulad3);
                    break;
                case "d4":
                    fondo.setImageResource(R.drawable.aulad4);
                    break;
                case "d5":
                    fondo.setImageResource(R.drawable.aulad5);
                    break;
                case "g2":
                    fondo.setImageResource(R.drawable.aulag2);
                    break;
                case "g3":
                    fondo.setImageResource(R.drawable.aulag3);
                    break;
                case "g4":
                    fondo.setImageResource(R.drawable.aulag4);
                    break;
                case "g5":
                    fondo.setImageResource(R.drawable.aulag5);
                    break;
                case "g6":
                    fondo.setImageResource(R.drawable.aulag6);
                    break;
                case "g7":
                    fondo.setImageResource(R.drawable.aulag7);
                    break;
                case "g8":
                    fondo.setImageResource(R.drawable.aulag8);
                    break;
                case "g9":
                    fondo.setImageResource(R.drawable.aulag9);
                    break;
                case "g10":
                    fondo.setImageResource(R.drawable.aulag10);
                    break;
            }


            /**if(a.equals("a1")){
                fondo.setImageResource(R.drawable.aulaa1);
            }else if(a.equals("a2")){
                fondo.setImageResource(R.drawable.aulaa2);
            }else if(a.equals("c1")){
                fondo.setImageResource(R.drawable.aulac1);
            }else if(a.equals("c2")){
                fondo.setImageResource(R.drawable.aulac2);
            }else if(a.equals("c3")){
                fondo.setImageResource(R.drawable.aulac3);
            }else if(a.equals("c4")){
                fondo.setImageResource(R.drawable.aulac4);
            }else if(a.equals("cc1")){
                fondo.setImageResource(R.drawable.aulacc1);
            }else if(a.equals("cc2")){
                fondo.setImageResource(R.drawable.aulacc2);
            }else if(a.equals("cc3")){
                fondo.setImageResource(R.drawable.aulacc3);
            }else if(a.equals("cc4")){
                fondo.setImageResource(R.drawable.aulacc4);
            }else if(a.equals("d1")){
                fondo.setImageResource(R.drawable.aulad1);
            }else if(a.equals("d2")){
                fondo.setImageResource(R.drawable.aulad2);
            }else if(a.equals("d3")){
                fondo.setImageResource(R.drawable.aulad3);
            }else if(a.equals("d4")){
                fondo.setImageResource(R.drawable.aulad4);
            }else if(a.equals("d5")){
                fondo.setImageResource(R.drawable.aulad5);
            }else if(a.equals("g2")){
                fondo.setImageResource(R.drawable.aulag2);
            }else if(a.equals("g3")){
                fondo.setImageResource(R.drawable.aulag3);
            }else if(a.equals("g4")){
                fondo.setImageResource(R.drawable.aulag4);
            }else if(a.equals("g5")){
                fondo.setImageResource(R.drawable.aulag5);
            }else if(a.equals("g6")){
                fondo.setImageResource(R.drawable.aulag6);
            }else if(a.equals("g7")){
                fondo.setImageResource(R.drawable.aulag7);
            }else if(a.equals("g8")){
                fondo.setImageResource(R.drawable.aulag8);
            }else if(a.equals("g9")){
                fondo.setImageResource(R.drawable.aulag9);
            }else if(a.equals("g10")){
                fondo.setImageResource(R.drawable.aulag10);
            }**/

        }

    }


}
