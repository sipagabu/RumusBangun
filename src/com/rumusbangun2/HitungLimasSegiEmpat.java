package com.rumusbangun2;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class HitungLimasSegiEmpat extends Activity {
	private EditText txtLebarLimas;
	private EditText txtTinggiLimas;
	private EditText txtPanjangLimas;
	private EditText txtLuasLimas;
	private EditText txtVolumeLimas;
	private Button hitungLimasSegiEmpat;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.limassegiempat);
        
        txtTinggiLimas = (EditText)findViewById (R.id.txtTinggiLimas);
        txtLebarLimas = (EditText)findViewById (R.id.txtLebarLimas);
        txtPanjangLimas = (EditText) findViewById (R.id.txtPanjangLimas);
        txtVolumeLimas = (EditText) findViewById (R.id.txtVolumeLimas);
        txtLuasLimas = (EditText) findViewById (R.id.txtLuasLimas);
        hitungLimasSegiEmpat = (Button) findViewById(R.id.btnHitungLimasSegiEmpat);
       
    }
    
    public void hitungLimasSegiEmpat(View view) {
		try {

			int Lebar = Integer.parseInt(txtLebarLimas.getText().toString());
			int Tinggi = Integer.parseInt(txtTinggiLimas.getText().toString());
			int Panjang = Integer.parseInt(txtPanjangLimas.getText().toString());
			
			
			//- Volume : Panjang dikali lebar dikali tinggi dibagi tiga (p x l x t x 1/3)
			//- Luas : ((p + l) t) + (p x l)
			
			double Luas = ((Panjang + Lebar )* Tinggi) + (Panjang * Lebar );
			double Volume = (Panjang * Lebar * Tinggi)/3;
			
			//rumus luas 4 x phi x r x r
			//rumus volume 4/3 x phi x r x t x t x t
			txtLuasLimas.setText(String.valueOf(Luas));
			txtVolumeLimas.setText(String.valueOf(Volume));
			finish();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    
    public void backtoMenu(View view){
		finish();
	}
}
