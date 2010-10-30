package com.rumusbangun2;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class HitungTabung extends Activity {
	private EditText txtJariJariTabung;
	private EditText txtTinggiTabung;
	private EditText txtVolumeTabung;
	private EditText txtLuasTabung;
	public Button btnHitungTabung;
	
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tabung);
        txtJariJariTabung = (EditText)findViewById (R.id.txtJariJariTabung);
        txtLuasTabung = (EditText) findViewById (R.id.txtLuasTabung);
        txtVolumeTabung = (EditText) findViewById (R.id.txtVolumeTabung);
        txtTinggiTabung = (EditText) findViewById (R.id.txtTinggiTabung);
        btnHitungTabung = (Button) findViewById(R.id.btnHitungTabung);
        
    }
    
    public void hitungTabung(View view) {
		try {

			int JariJari = Integer.parseInt(txtJariJariTabung.getText().toString());
			int Tinggi = Integer.parseInt(txtTinggiTabung.getText().toString());
			double phi = 3.14;
			//double LuasTabung = (phi * JariJariTabung * 2) * (Tinggi * JariJariTabung);
			//double VolumeTabung = phi * Tinggi * JariJariTabung * JariJariTabung;
			double LuasTabung = (phi * JariJari * 2) * (Tinggi * JariJari);
			double VolumeTabung = phi * Tinggi * JariJari * JariJari;
			txtLuasTabung.setText(String.valueOf(LuasTabung));
			txtVolumeTabung.setText(String.valueOf(VolumeTabung));
			finish();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
    
    public void backtoMenu(View view){
		finish();
	}
    
}
    