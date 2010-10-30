package com.rumusbangun2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class HitungLingkaran extends Activity {
	private EditText txtJariJari;
	private EditText txtLuasLingkaran;
	private EditText txtKelilingLingkaran;
	private Button btnHitungLingkaran;
	
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lingkaran);
        txtJariJari = (EditText)findViewById (R.id.txtJariJari);
        txtLuasLingkaran = (EditText) findViewById (R.id.txtLuasLingkaran);
        txtKelilingLingkaran = (EditText) findViewById (R.id.txtKelilingLingkaran);
        btnHitungLingkaran = (Button) findViewById(R.id.btnHitungLingkaran);
        
    }
    
    public void hitungLingkaran(View view) {
		try {

			int JariJari = Integer.parseInt(txtJariJari.getText().toString());
			double phi = 3.14;
			double Luas = phi * JariJari * JariJari;
			double Keliling = 2 * (phi * JariJari);
			txtLuasLingkaran.setText(String.valueOf(Luas));
			txtKelilingLingkaran.setText(String.valueOf(Keliling));
			finish();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
    
	/**
	 * Method untuk menutup activity dan kembali ke menu
	 * @param view
	 */
	public void backtoMenu(View view){
		finish();
	}
}