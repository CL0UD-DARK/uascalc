package com.calc;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    Button bplus,bmin,bmultiple,bdiv;
    EditText in1,in2,result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        in1 = (EditText) findViewById(R.id.editText1);
        in2 = (EditText) findViewById(R.id.editText2);
        result = (EditText) findViewById(R.id.editTextResult);
        bplus = (Button) findViewById(R.id.btnplus);
        bmin = (Button) findViewById(R.id.btnmin);
        bmultiple = (Button) findViewById(R.id.btnmultiple);
        bdiv = (Button) findViewById(R.id.btndiv);

        bplus.setOnClickListener(this);
        bmin.setOnClickListener(this);
        bmultiple.setOnClickListener(this);
        bdiv.setOnClickListener(this);

    }






    @Override
    public void onClick(View v){
        Toast pieceToast=null;
        switch (v.getId()) {
            case R.id.btnplus:
                String val1 = in1.getText().toString();
                String val2 = in2.getText().toString();
                if(val1.equals("") || val2.equals("")){
                    pieceToast= Toast.makeText(getApplicationContext(), "angka belum di tulis", Toast.LENGTH_SHORT);
                    pieceToast.show();
                    break;
                }
                String retval = pluscalc(val1,val2);
                result.setText(retval);
                break;
            case R.id.btnmin:
                String min1 = in1.getText().toString();
                String min2 = in2.getText().toString();
                if(min1.equals("") || min2.equals("")){
                    pieceToast= Toast.makeText(getApplicationContext(), "angka belum di tulis", Toast.LENGTH_SHORT);
                    pieceToast.show();
                    break;
                }
                String retvalmin = mincalc(min1, min2);
                result.setText(retvalmin);
                break;
            case R.id.btnmultiple:
                String multi1 = in1.getText().toString();
                String multi2 = in2.getText().toString();
                if(multi1.equals("") || multi2.equals("")){
                    pieceToast= Toast.makeText(getApplicationContext(), "angka belum di tulis", Toast.LENGTH_SHORT);
                    pieceToast.show();
                    break;
                }
                String retvalmulti = multiplecalc(multi1, multi2);
                result.setText(retvalmulti);
                break;
            case R.id.btndiv    :
                String div1 = in1.getText().toString();
                String div2 = in2.getText().toString();
                if(div1.equals("") || div2.equals("")){
                    pieceToast= Toast.makeText(getApplicationContext(), "angka belum di tulis", Toast.LENGTH_SHORT);
                    pieceToast.show();
                    break;
                }
                String retvaldiv = divcalc(div1, div2);
                result.setText(retvaldiv);
                break;
        }
    }
    private String pluscalc(String a, String b){
        Double d1 = Double.parseDouble(a);
        Double d2 = Double.parseDouble(b);
        Double dhasil = d1 + d2;
        String shasil = String.valueOf(dhasil);
        return shasil;
    }
    private String mincalc(String a, String b){
        Double d1 = Double.parseDouble(a);
        Double d2 = Double.parseDouble(b);
        Double dhasil = d1 - d2;
        String shasil = String.valueOf(dhasil);
        return shasil;
    }
    private String multiplecalc(String a, String b){
        Double d1 = Double.parseDouble(a);
        Double d2 = Double.parseDouble(b);
        Double dhasil = d1 * d2;
        String shasil = String.valueOf(dhasil);
        return shasil;
    }
    private String divcalc(String a, String b){
        Double d1 = Double.parseDouble(a);
        Double d2 = Double.parseDouble(b);
        Double dhasil = d1 / d2;
        String shasil = String.valueOf(dhasil);
        return shasil;
    }

}