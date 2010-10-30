
package com.rumusbangun2;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class HitungSegitiga extends Activity {
	private EditText txtAlas;
	private EditText txtTinggi;
	private EditText txtLuas;
	private Button btnHitung;

	/**
	 * Method yang dipanggil pada saat applikaasi dijalankan
	 * */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.segitiga);
		txtAlas = (EditText) findViewById(R.id.txtAlas);
		txtTinggi = (EditText) findViewById(R.id.txtTinggi);
		txtLuas = (EditText) findViewById(R.id.txtLuas);
		btnHitung = (Button) findViewById(R.id.btnHitung);

	}

	/**
	 * Method untuk Menghitung Luas Segitiga dipanggil pada saat button
	 * Hitung Luas diklik
	 *
	 * @param view
	 */
	public void hitungLuas(View view) {
		try {

			int alas = Integer.parseInt(txtAlas.getText().toString());
			int tinggi = Integer.parseInt(txtTinggi.getText().toString());
			int luas = (alas * tinggi) / 2;
			txtLuas.setText(String.valueOf(luas));
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