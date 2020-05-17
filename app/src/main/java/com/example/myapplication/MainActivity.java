package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;


public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,btititk,bplus,bmin,bkali,bbagi,bhitung,bhapus,bakar,bpangkat;
    TextView ta,tb,tc,td;
    String nilaia,nilaib,nilaic,nilaid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(" La Ode Rahimsyah ");
        toolbar.setSubtitle(" 13020170045");
        toolbar.setLogo(R.drawable.calculator);
        b1 = (Button)findViewById(R.id.button1);
        b2 = (Button)findViewById(R.id.button2);
        b3 = (Button)findViewById(R.id.button3);
        b4 = (Button)findViewById(R.id.button4);
        b5 = (Button)findViewById(R.id.button5);
        b6 = (Button)findViewById(R.id.button6);
        b7 = (Button)findViewById(R.id.button7);
        b8 = (Button)findViewById(R.id.button8);
        b9 = (Button)findViewById(R.id.button9);
        b0 = (Button)findViewById(R.id.button0);
        btititk=(Button)findViewById(R.id.buttontitik);
        bhapus=(Button)findViewById(R.id.button27);
        bplus = (Button)findViewById(R.id.buttonp);
        bmin = (Button)findViewById(R.id.buttonm);
        bkali = (Button)findViewById(R.id.buttonk);
        bbagi = (Button)findViewById(R.id.buttonb);
        bhitung = (Button)findViewById(R.id.buttonh);
        bakar = (Button) findViewById(R.id.button25);
        bpangkat = (Button) findViewById(R.id.button26);

        ta=(TextView)findViewById(R.id.textViewa);
        tb=(TextView)findViewById(R.id.textViewb);
        tc=(TextView)findViewById(R.id.textViewc);
        td=(TextView)findViewById(R.id.textViewd);

        bhapus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nilaia=null;
                nilaib=null;
                nilaic=null;
                nilaid=null;
                ta.setText("");
                tb.setText("");
                tc.setText("");
                td.setText("");
            }
        });

        bplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tb.setText("+");
                nilaib = "+";
            }
        });
        bmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tb.setText("-");
                nilaib = "-";
            }
        });
        bkali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tb.setText("x");
                nilaib = "x";
            }
        });
        bbagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tb.setText("/");
                nilaib = "/";
            }
        });
        bakar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tb.setText("√");
                nilaib = "√";
                ta.setText("0");
            }
        });
        bpangkat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tb.setText("^");
                nilaib = "^";
            }
        });

        bhitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (nilaia !=null && nilaic != null){

                    if(nilaib=="+") {
                        nilaid= String.valueOf(Double.parseDouble(nilaia)+Double.parseDouble(nilaic));
                        td.setText(nilaid);
                    }
                    if(nilaib=="-") {
                        nilaid= String.valueOf(Double.parseDouble(nilaia)-Double.parseDouble(nilaic));
                        td.setText(nilaid);
                    }
                    if(nilaib=="x") {
                        nilaid= String.valueOf(Double.parseDouble(nilaia)*Double.parseDouble(nilaic));
                        td.setText(nilaid);
                    }
                    if(nilaib=="/") {
                        nilaid= String.valueOf(Double.parseDouble(nilaia)/Double.parseDouble(nilaic));
                        td.setText(nilaid);
                    }
                    if (nilaib=="√"){
                        try{
                        double hasil =0;
                        double i;
                        for (i=Double.parseDouble(ta.getText().toString());i<Double.parseDouble(tc.getText().toString());i++){
                            if ((Double.parseDouble(tc.getText().toString())/i)==i){
                                hasil = Double.parseDouble(tc.getText().toString())/i;
                            }
                        }
                        nilaid=String.valueOf(hasil);
                        td.setText(nilaid);
                        } catch (Exception e){
                        }
                    }
                    if (nilaib=="^"){
                        try{
                            double hsl=1;
                            double i;
                            for (i=1;i<=Double.parseDouble(tc.getText().toString());i++){
                                    hsl = Double.parseDouble(ta.getText().toString())*hsl;
                            }
                            nilaid=String.valueOf(hsl);
                            td.setText(nilaid);
                        } catch (Exception e){
                            td.setText("inputan anda tidak valid");
                        }
                    }
                }
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (nilaib==null) {
                    nilaia=b1.getText().toString();
                    ta.setText(ta.getText()+""+nilaia);
                    nilaia=ta.getText().toString();
                }
                if (nilaib!=null) {
                    nilaic=b1.getText().toString();
                    tc.setText(tc.getText()+""+nilaic);
                    nilaic=tc.getText().toString();
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (nilaib==null) {
                    nilaia=b2.getText().toString();
                    ta.setText(ta.getText()+""+nilaia);
                    nilaia=ta.getText().toString();
                }

                if (nilaib!=null) {
                    nilaic=b2.getText().toString();
                    tc.setText(tc.getText()+""+nilaic);
                    nilaic=tc.getText().toString();
                }
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (nilaib==null) {
                    nilaia=b3.getText().toString();
                    ta.setText(ta.getText()+""+nilaia);
                    nilaia=ta.getText().toString();
                }

                if (nilaib!=null) {
                    nilaic=b3.getText().toString();
                    tc.setText(tc.getText()+""+nilaic);
                    nilaic=tc.getText().toString();
                }
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (nilaib==null) {
                    nilaia=b4.getText().toString();
                    ta.setText(ta.getText()+""+nilaia);
                    nilaia=ta.getText().toString();
                }

                if (nilaib!=null) {
                    nilaic=b4.getText().toString();
                    tc.setText(tc.getText()+""+nilaic);
                    nilaic=tc.getText().toString();
                }
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (nilaib==null) {
                    nilaia=b5.getText().toString();
                    ta.setText(ta.getText()+""+nilaia);
                    nilaia=ta.getText().toString();
                }
                if (nilaib!=null) {
                    nilaic=b5.getText().toString();
                    tc.setText(tc.getText()+""+nilaic);
                    nilaic=tc.getText().toString();
                }
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (nilaib==null) {
                    nilaia=b6.getText().toString();
                    ta.setText(ta.getText()+""+nilaia);
                    nilaia=ta.getText().toString();
                }
                if (nilaib!=null) {
                    nilaic=b6.getText().toString();
                    tc.setText(tc.getText()+""+nilaic);
                    nilaic=tc.getText().toString();
                }
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (nilaib==null) {
                    nilaia=b7.getText().toString();
                    ta.setText(ta.getText()+""+nilaia);
                    nilaia=ta.getText().toString();
                }

                if (nilaib!=null) {
                    nilaic=b7.getText().toString();
                    tc.setText(tc.getText()+""+nilaic);
                    nilaic=tc.getText().toString();
                }
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (nilaib==null) {
                    nilaia=b8.getText().toString();
                    ta.setText(ta.getText()+""+nilaia);
                    nilaia=ta.getText().toString();
                }

                if (nilaib!=null) {
                    nilaic=b8.getText().toString();
                    tc.setText(tc.getText()+""+nilaic);
                    nilaic=tc.getText().toString();
                }

            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (nilaib==null) {
                    nilaia=b9.getText().toString();
                    ta.setText(ta.getText()+""+nilaia);
                    nilaia=ta.getText().toString();
                }

                if (nilaib!=null) {
                    nilaic=b9.getText().toString();
                    tc.setText(tc.getText()+""+nilaic);
                    nilaic=tc.getText().toString();
                }

            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (nilaib==null) {
                    nilaia=b0.getText().toString();
                    ta.setText(ta.getText()+""+nilaia);
                    nilaia=ta.getText().toString();
                }

                if (nilaib!=null) {
                    nilaic=b0.getText().toString();
                    tc.setText(tc.getText()+""+nilaic);
                    nilaic=tc.getText().toString();
                }

            }
        });
        btititk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (nilaib==null&&nilaia!=null) {
                    nilaia=btititk.getText().toString();
                    ta.setText(ta.getText()+""+nilaia);
                    nilaia=ta.getText().toString();
                }

                if (nilaib!=null&&nilaia!=null) {
                    nilaic=btititk.getText().toString();
                    tc.setText(tc.getText()+""+nilaic);
                    nilaic=tc.getText().toString();
                }

            }
        });
    }
}
