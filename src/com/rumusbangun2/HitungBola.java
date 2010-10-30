package com.rumusbangun2;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class HitungBola extends Activity {
	private EditText txtJariJariBola;
	private EditText txtTinggiBola;
	private EditText txtLuasBola;
	private EditText txtVolumeBola;
	private Button btnHitungBola;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bola);
        
        txtTinggiBola = (EditText)findViewById (R.id.txtTinggiBola);
        txtJariJariBola = (EditText)findViewById (R.id.txtJariJariBola);
        txtLuasBola = (EditText) findViewById (R.id.txtLuasBola);
        txtVolumeBola = (EditText) findViewById (R.id.txtVolumeBola);
        btnHitungBola = (Button) findViewById(R.id.btnHitungBola);
       
    }
    
    public void hitungBola(View view) {
		try {

			int JariJariBola = Integer.parseInt(txtJariJariBola.getText().toString());
			int TinggiBola  = Integer.parseInt(txtTinggiBola.getText().toString());
			
			double phi = 3.14;
			double LuasBola  = 4 * phi * JariJariBola  * JariJariBola ;
			double VolumeBola  = 1.33333333 * phi * JariJariBola  * TinggiBola  * TinggiBola  * TinggiBola ;
			
			//rumus luas 4 x phi x r x r
			//rumus volume 4/3 x phi x r x t x t x t
			txtLuasBola.setText(String.valueOf(LuasBola ));
			txtVolumeBola.setText(String.valueOf(VolumeBola));
			finish();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    
    public void backtoMenu(View view){
		finish();
	}
}
