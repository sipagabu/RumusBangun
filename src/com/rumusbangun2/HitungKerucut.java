package com.rumusbangun2;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class HitungKerucut extends Activity {
	private EditText txtJariJariKerucut;
	private EditText txtTinggiKerucut;
	private EditText txtSisiMiringKerucut;
	private EditText txtLuasKerucut;
	private EditText txtVolumeKerucut;
	private Button btnHitungKerucut;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kerucut);
        
        txtTinggiKerucut = (EditText)findViewById (R.id.txtTinggiKerucut);
        txtJariJariKerucut = (EditText)findViewById (R.id.txtJariJariKerucut);
        txtSisiMiringKerucut = (EditText) findViewById (R.id.txtSisiMiringKerucut);
        txtLuasKerucut = (EditText) findViewById (R.id.txtLuasKerucut);
        txtVolumeKerucut = (EditText) findViewById (R.id.txtVolumeKerucut);
        btnHitungKerucut = (Button) findViewById(R.id.btnHitungKerucut);
       
    }
    
    public void hitungKerucut(View view) {
		try {

			int JariJari = Integer.parseInt(txtJariJariKerucut.getText().toString());
			int Tinggi = Integer.parseInt(txtTinggiKerucut.getText().toString());
			int SisiMiring = Integer.parseInt(txtSisiMiringKerucut.getText().toString());
			
			double phi = 3.14;
			double Luas = phi * JariJari * JariJari * SisiMiring ;
			double Volume = phi * JariJari * JariJari * Tinggi * 0.333333 ;
			
             ///Rumus Kerucut
			//- Volume : phi dikali jari-jari dikali jari-jari dikali tinggi dibagi tiga (phi x r2 x t x 1/3)
			//- Luas : (phi x r) x (S x r)
			//- S : Sisi miring kerucut dari alas ke puncak (bukan tingi)
			
			txtLuasKerucut.setText(String.valueOf(Luas));
			txtVolumeKerucut.setText(String.valueOf(Volume));
			finish();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    
    public void backtoMenu(View view){
		finish();
	}
}


