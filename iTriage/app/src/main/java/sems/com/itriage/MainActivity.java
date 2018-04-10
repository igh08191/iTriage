package sems.com.itriage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageButton imageButtonMedico;
    ImageButton imageCasaInfo;
    ImageButton imageLocPaciente;
    ImageButton imageAmbulancia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageButtonMedico = (ImageButton)findViewById(R.id.imageButtonMedico);
        imageCasaInfo = (ImageButton)findViewById(R.id.imageCasaInfo);
        imageLocPaciente = (ImageButton)findViewById(R.id.imageLocPaciente);
        imageAmbulancia = (ImageButton)findViewById(R.id.imageAmbulancia);

        imageButtonMedico.setOnClickListener(new View.OnClickListener(){
            public void onClick(View w)
            {
                Intent intent = new Intent(MainActivity.this, TriageActivity.class);
                startActivity(intent);
            }
        });
        imageCasaInfo.setOnClickListener(new View.OnClickListener(){
            public void onClick(View w)
            {
                Toast.makeText(MainActivity.this, "imageCasaInfo works", Toast.LENGTH_LONG).show();
            }
        });
        imageLocPaciente.setOnClickListener(new View.OnClickListener(){
            public void onClick(View w)
            {
                Toast.makeText(MainActivity.this, "imageLocPaciente works", Toast.LENGTH_LONG).show();
            }
        });
        imageAmbulancia.setOnClickListener(new View.OnClickListener(){
            public void onClick(View w)
            {
                Toast.makeText(MainActivity.this, "imageAmbulancia works", Toast.LENGTH_LONG).show();
            }
        });
    }
}
