package com.prothes.trianglepyramid;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.pdfview.PDFView;

public class MainActivity extends AppCompatActivity {
    private TextInputEditText inputField1;
    private TextView display1;
    private AppCompatButton btn1,resetBtn;
    private CheckBox check1,check2,check3,check4,check5,check6,check7,check8,check9,check10,check11,check12,check13,check14,check15,check16,check17,check18,check19,check20,check21,check22,check23,check24,check25;
    private PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().setNavigationBarColor(getColor(R.color.sky));
        this.getWindow().setStatusBarColor(getColor(R.color.sky));
        setContentView(R.layout.activity_main);

        pdfView = findViewById(R.id.pdfView);
        inputField1 = findViewById(R.id.inputField1);
        display1 = findViewById(R.id.display1);
        btn1 = findViewById(R.id.btn1);
        resetBtn = findViewById(R.id.resetBtn);
        check1 = findViewById(R.id.check1);
        check2 = findViewById(R.id.check2);
        check3 = findViewById(R.id.check3);
        check4 = findViewById(R.id.check4);
        check5 = findViewById(R.id.check5);
        check6 = findViewById(R.id.check6);
        check7 = findViewById(R.id.check7);
        check8 = findViewById(R.id.check8);
        check9 = findViewById(R.id.check9);
        check10 = findViewById(R.id.check10);
        check11 = findViewById(R.id.check11);
        check12 = findViewById(R.id.check12);
        check13 = findViewById(R.id.check13);
        check14 = findViewById(R.id.check14);
        check15 = findViewById(R.id.check15);
        check16 = findViewById(R.id.check16);
        check17 = findViewById(R.id.check17);
        check18 = findViewById(R.id.check18);
        check19 = findViewById(R.id.check19);
        check20 = findViewById(R.id.check20);
        check21 = findViewById(R.id.check21);
        check22 = findViewById(R.id.check22);
        check23 = findViewById(R.id.check23);
        check24 = findViewById(R.id.check24);
        check25 = findViewById(R.id.check25);

        pdfView.fromAsset("pattern.pdf")
                        .show();


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getData = inputField1.getText().toString();



                // Square Hollow Pattern Start Here ==============================1===============================
                if (getData.length()>0 && check1.isChecked()){
                    int num1 = Integer.parseInt(getData);
                    StringBuilder stringBuilder = new StringBuilder();

                    for (int i = 1; i <= num1; i++){
                        for (int j = 1; j <= num1; j++){
                            if (i == 1 || j == 1 || i == num1 || j == num1) {
                                stringBuilder.append(" * ");
                            }else {
                                stringBuilder.append("    ");
                            }
                        }
                        stringBuilder.append("\n");
                    }
                    display1.setText(""+stringBuilder);
                    inputField1.setError(null);
                }// Square Hollow Pattern End Here ===============================1==================================


                //Number triangle Pattern Start Here ================================2=================================
                else if (getData.length()>0 && check2.isChecked()) {
                    int num2 = Integer.parseInt(getData);
                    StringBuilder stringBuilder = new StringBuilder();
                    for (int i=1; i<=num2; i++){
                        for (int j = 1; j<=num2-i; j++){
                            stringBuilder.append("  ");
                        }
                        for (int j = 1; j<=i; j++){
                            stringBuilder.append(i+"  ");
                        }
                        stringBuilder.append("\n");
                    }
                    display1.setText(""+stringBuilder);
                    inputField1.setError(null);
                }//Number triangle Pattern End Here ================================2=================================

                //Number-increasing Pyramid Pattern Start Here ================================3=================================
                else if (getData.length()>0 && check3.isChecked()) {
                    int num3 = Integer.parseInt(getData);
                    StringBuilder stringBuilder = new StringBuilder();
                    for (int i=1; i<=num3; i++){
                        for(int j=1; j<=i; j++){
                            stringBuilder.append(j + " ");
                        }
                        stringBuilder.append("\n");
                    }
                    display1.setText(""+stringBuilder);
                    inputField1.setError(null);
                }//Number-increasing Pyramid Pattern End Here ================================3=================================


                // Number-increasing reverse Pyramid Pattern Start Here ================================4=================================
                else if (getData.length()>0 && check4.isChecked()) {
                    int num4 = Integer.parseInt(getData);
                    StringBuilder stringBuilder = new StringBuilder();
                    for (int i=num4; i>=1; i--){
                        for (int j = 1; j<=i; j++){
                            stringBuilder.append(j+" ");
                        }
                        stringBuilder.append("\n");
                    }
                    display1.setText(""+stringBuilder);
                    inputField1.setError(null);
                }// Number-increasing reverse Pyramid Pattern End Here ================================4=================================


                // Number-changing Pyramid Pattern Start Here ================================5=================================
                else if (getData.length()>0 && check5.isChecked()) {
                    int num5 = Integer.parseInt(getData);
                    StringBuilder stringBuilder = new StringBuilder();
                    int count = 0;
                    for (int i=1; i<=num5; i++){
                        for (int j=1; j<=i; j++){
                            count++;
                            stringBuilder.append(count+" ");
                        }
                        stringBuilder.append("\n");
                    }
                    display1.setText(""+stringBuilder);
                    inputField1.setError(null);
                }// Number-changing Pyramid Pattern End Here ================================5=================================

                // Zero-One Triangle Pattern Start Here ================================6=================================
                else if (getData.length()>0 && check6.isChecked()) {
                    int num6 = Integer.parseInt(getData);
                    StringBuilder stringBuilder = new StringBuilder();
                    for (int i=1; i<=num6; i++){
                        for (int j=1; j<=i; j++){
                            if ((i+j)%2 == 0){
                                stringBuilder.append(0+ " ");
                            }else{
                                stringBuilder.append(1 + " ");
                            }
                        }
                        stringBuilder.append("\n");
                    }
                    display1.setText(""+stringBuilder);
                    inputField1.setError(null);
                }// Zero-One Triangle Pattern End Here ================================6=================================


                // Palindrome Triangle Pattern Start Here ================================7=================================
                else if (getData.length()>0 && check7.isChecked()) {
                    int num7 = Integer.parseInt(getData);
                    StringBuilder stringBuilder = new StringBuilder();
                    for (int i=1; i<=num7; i++){
                        for (int j=1; j<=num7-i; j++){
                            stringBuilder.append("   ");
                        }
                        for (int j = i; j>=1; j--){
                            stringBuilder.append(j+ " ");
                        }
                        for (int j=2; j<=i; j++){
                            stringBuilder.append(j+" ");
                        }
                        stringBuilder.append("\n");
                    }
                    display1.setText(""+stringBuilder);
                    inputField1.setError(null);
                }// Palindrome Triangle Pattern End Here ================================7=================================


                // Rhombus Pattern Start Here ================================8=================================
                else if (getData.length()>0 && check8.isChecked()) {
                    int num8 = Integer.parseInt(getData);
                    StringBuilder stringBuilder = new StringBuilder();
                    for (int i=1; i<=num8; i++){
                        for (int j=1; j<=num8-i; j++){
                            stringBuilder.append(" ");
                        }
                        for (int j = 1; j<=num8; j++){
                            stringBuilder.append("*");
                        }
                        stringBuilder.append("\n");
                    }
                    display1.setText(""+stringBuilder);
                    inputField1.setError(null);
                }// Rhombus Pattern End Here ================================8=================================


                // Diamond Star Pattern Start Here ================================9=================================
                else if (getData.length()>0 && check9.isChecked()) {
                    int num9 = Integer.parseInt(getData);
                    StringBuilder stringBuilder = new StringBuilder();
                    // Upper Part......
                    for (int i=1; i<=num9; i++){
                        for (int j=1; j<=num9-i; j++){
                            stringBuilder.append("  ");
                        }
                        for (int j=1; j<=i; j++){
                            stringBuilder.append(" * ");
                        }
                        stringBuilder.append("\n");
                    }
                    // Lower Part
                    for (int i = num9-1; i >= 1; i--) {
                        for (int j = 1; j <= num9 - i; j++) {
                            stringBuilder.append("  ");
                        }
                        for (int j = 1; j <= i; j++) {
                            stringBuilder.append(" * ");
                        }
                        stringBuilder.append("\n");
                    }

                    display1.setText(""+stringBuilder);
                    inputField1.setError(null);
                }// Diamond Star Pattern End Here ================================9=================================

                // Butterfly Star Pattern Start Here ================================10=================================
                else if (getData.length()>0 && check10.isChecked()) {
                    int num10 = Integer.parseInt(getData);
                    StringBuilder stringBuilder = new StringBuilder();
                    Toast.makeText(MainActivity.this, "Upcomming", Toast.LENGTH_SHORT).show();
                    inputField1.setError(null);
                    display1.setText(""+stringBuilder);
                }// Butterfly Star Pattern End Here ================================10=================================


                // Square Fill Pattern Start Here ================================11=================================
                else if (getData.length()>0 && check11.isChecked()) {
                    int num11 = Integer.parseInt(getData);
                    StringBuilder stringBuilder = new StringBuilder();
                    for (int i = 1; i<=num11; i++){
                        for (int j=1; j<=num11; j++){
                            stringBuilder.append(" * ");
                        }
                        stringBuilder.append("\n");
                    }
                    display1.setText(""+stringBuilder);
                    inputField1.setError(null);
                }//Square Fill Pattern End Here ================================11=================================


                // Right Half Pyramid Start Here ================================12=================================
                else if (getData.length()>0 && check12.isChecked()) {
                    int num12 = Integer.parseInt(getData);
                    StringBuilder stringBuilder = new StringBuilder();
                    for (int i = 1; i<=num12; i++){
                        for (int j = 1; j<=i; j++){
                            stringBuilder.append(" * ");
                        }
                        stringBuilder.append("\n");
                    }
                    display1.setText(""+stringBuilder);
                    inputField1.setError(null);
                }// Right Half Pyramid End Here ================================12=================================


                // Reverse Right Half Pyramid Pattern Start Here ================================13=================================
                else if (getData.length()>0 && check13.isChecked()) {
                    int num13 = Integer.parseInt(getData);
                    StringBuilder stringBuilder = new StringBuilder();
                    for (int i = num13; i>=1; i--){
                        for (int j=1; j<=i; j++){
                            stringBuilder.append(" * ");
                        }
                        stringBuilder.append("\n");
                    }
                    display1.setText(""+stringBuilder);
                    inputField1.setError(null);
                }// Reverse Right Half Pyramid Pattern End Here ================================13=================================

                // Reverse Left Half Pyramid Pattern Start Here ================================14=================================
                else if (getData.length()>0 && check14.isChecked()) {
                    int num14 = Integer.parseInt(getData);
                    StringBuilder stringBuilder = new StringBuilder();
                    for (int i=1; i<=num14; i++){
                        for (int j=1; j<=num14-i; j++){
                            stringBuilder.append("   ");
                        }
                        for (int j=1; j<=i; j++){
                            stringBuilder.append(" *");
                        }
                        stringBuilder.append("\n");
                    }
                    display1.setText(""+stringBuilder);
                    inputField1.setError(null);
                }// Reverse Left Half Pyramid Pattern End Here ================================14=================================

                // Reverse Left Half Pyramid Pattern Start Here ================================15=================================
                else if (getData.length()>0 && check15.isChecked()) {
                    int num15 = Integer.parseInt(getData);
                    StringBuilder stringBuilder = new StringBuilder();
                    for (int i=num15; i>=1; i--){
                        for (int j=1; j<=num15-i; j++){
                            stringBuilder.append("   ");
                        }
                        for (int j=1; j<=i; j++){
                            stringBuilder.append(" * ");
                        }
                        stringBuilder.append("\n");
                    }
                    display1.setText(""+stringBuilder);
                    inputField1.setError(null);
                }// Reverse Left Half Pyramid Pattern End Here ================================15=================================


                // Triangle Star Pattern Start Here ================================16=================================
                else if (getData.length()>0 && check16.isChecked()) {
                    int num16 = Integer.parseInt(getData);
                    StringBuilder stringBuilder = new StringBuilder();
                    for (int i=1; i<=num16; i++){
                        for (int j=1; j<=num16-i; j++){
                            stringBuilder.append("  ");
                        }
                        for (int j=1; j<=i; j++){
                            stringBuilder.append(" * ");
                        }
                        stringBuilder.append("\n");
                    }
                    display1.setText(""+stringBuilder);
                    inputField1.setError(null);
                }// Triangle Star Pattern End Here ================================16=================================


                // Reverse number Triangle Pattern Start Here ================================17=================================
                else if (getData.length()>0 && check17.isChecked()) {
                    int num17 = Integer.parseInt(getData);
                    StringBuilder stringBuilder = new StringBuilder();
                    for (int i=1; i<=num17; i++){
                        for (int j=1; j<=i-1; j++){
                            stringBuilder.append("  ");
                        }
                        for (int j = i; j<=num17; j++ ){
                            stringBuilder.append(j+ "  ");
                        }
                        stringBuilder.append("\n");
                    }
                    display1.setText(""+stringBuilder);
                    inputField1.setError(null);
                }// Reverse number Triangle Pattern End Here ================================17=================================

                // Mirror Image Triangle Pattern Start Here ================================18=================================
                else if (getData.length()>0 && check18.isChecked()) {
                    int num18 = Integer.parseInt(getData);
                    StringBuilder stringBuilder = new StringBuilder();
                    // Upper Section
                    for (int i=1; i<=num18; i++){
                        for (int j=1; j<=i-1; j++){
                            stringBuilder.append("  ");
                        }
                        for (int j = i; j<=num18; j++){
                            stringBuilder.append(j+ "  ");
                        }
                        stringBuilder.append("\n");
                    }
                    // Bottom Section
                    for (int i=num18-1; i>=1; i--){
                        for (int j=1; j<=i-1; j++){
                            stringBuilder.append("  ");
                        }
                        for (int j=i; j<=num18; j++){
                            stringBuilder.append(j+"  ");
                        }
                        stringBuilder.append("\n");
                    }
                    display1.setText(""+stringBuilder);
                    inputField1.setError(null);
                }// Mirror Image Triangle Pattern End Here ================================18=================================

                else if (getData.length()>0 && check19.isChecked()) {
                    int num1 = Integer.parseInt(getData);
                    StringBuilder stringBuilder = new StringBuilder();
                    Toast.makeText(MainActivity.this, "Upcomming", Toast.LENGTH_SHORT).show();
                    display1.setText(""+stringBuilder);
                    inputField1.setError(null);
                }

                else if (getData.length()>0 && check20.isChecked()) {
                    int num1 = Integer.parseInt(getData);
                    StringBuilder stringBuilder = new StringBuilder();
                    Toast.makeText(MainActivity.this, "Upcomming", Toast.LENGTH_SHORT).show();
                    display1.setText(""+stringBuilder);
                    inputField1.setError(null);
                }

                else if (getData.length()>0 && check21.isChecked()) {
                    int num1 = Integer.parseInt(getData);
                    StringBuilder stringBuilder = new StringBuilder();
                    Toast.makeText(MainActivity.this, "Upcomming", Toast.LENGTH_SHORT).show();
                    display1.setText(""+stringBuilder);
                    inputField1.setError(null);
                }

                else if (getData.length()>0 && check22.isChecked()) {
                    int num1 = Integer.parseInt(getData);
                    StringBuilder stringBuilder = new StringBuilder();
                    Toast.makeText(MainActivity.this, "Upcomming", Toast.LENGTH_SHORT).show();
                    display1.setText(""+stringBuilder);
                    inputField1.setError(null);
                }

                // Pascal’s Triangle Start Here ================================23=================================
                else if (getData.length()>0 && check23.isChecked()) {
                    int num23 = Integer.parseInt(getData);
                    StringBuilder stringBuilder = new StringBuilder();
                    for (int i=1; i<=num23; i++){
                        for (int j=1; j<=num23-i; j++){
                            stringBuilder.append("  ");
                        }
                        int x = 1;
                        for (int j=1; j<=i; j++){
                            stringBuilder.append(x+"  ");
                            //Pascal triangle Law....
                            x = x * (i - j) / j;
                        }
                        stringBuilder.append("\n");
                    }
                    display1.setText(""+stringBuilder);
                    inputField1.setError(null);
                }// Pascal’s Triangle End Here ================================23=================================

                // Right Pascal’s Triangle Start Here ================================24=================================
                else if (getData.length()>0 && check24.isChecked()) {
                    int num24 = Integer.parseInt(getData);
                    StringBuilder stringBuilder = new StringBuilder();
                    // Upper
                    for (int i=1; i<=num24; i++){
                        for (int j=1; j<=i; j++){
                            stringBuilder.append(" * ");
                        }
                        stringBuilder.append("\n");
                    }
                    // Lower
                    for (int i=num24-1; i>=1; i--){
                        for (int j=1; j<=i; j++){
                            stringBuilder.append(" * ");
                        }
                        stringBuilder.append("\n");
                    }
                    display1.setText(""+stringBuilder);
                    inputField1.setError(null);
                }// Right Pascal’s Triangle End Here ================================24=================================


                // K Pattern Start Here ================================25=================================
                else if (getData.length()>0 && check25.isChecked()) {
                    int num25 = Integer.parseInt(getData);
                    StringBuilder stringBuilder = new StringBuilder();
                    // Upper
                    for (int i=num25; i>=1; i--){
                        for (int j=1; j<=i; j++){
                            stringBuilder.append(" * ");
                        }
                        stringBuilder.append("\n");
                    }
                    // Lower
                    for (int i=num25-1; i>=1; i--){
                        for (int j=i; j<=num25; j++){
                            stringBuilder.append(" * ");
                        }
                        stringBuilder.append("\n");
                    }

                    display1.setText(""+stringBuilder);
                    inputField1.setError(null);
                }// K Pattern End Here ================================25=================================

                else{
                    display1.setText(null);
                    inputField1.setError("Empty");
                    Toast.makeText(MainActivity.this, "Input Number\n&\nSelect one Check Box", Toast.LENGTH_SHORT).show();
                }



            }
        });






        // Reset Btn Start Here
        resetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display1.setText(null);
                inputField1.setError(null);
                inputField1.setText(null);
                check1.setChecked(false);
                check2.setChecked(false);
                check3.setChecked(false);
                check4.setChecked(false);
                check5.setChecked(false);
                check6.setChecked(false);
                check7.setChecked(false);
                check8.setChecked(false);
                check9.setChecked(false);
                check10.setChecked(false);
                check11.setChecked(false);
                check12.setChecked(false);
                check13.setChecked(false);
                check14.setChecked(false);
                check15.setChecked(false);
                check16.setChecked(false);
                check17.setChecked(false);
                check18.setChecked(false);
                check19.setChecked(false);
                check20.setChecked(false);
                check21.setChecked(false);
                check22.setChecked(false);
                check23.setChecked(false);
                check24.setChecked(false);
                check25.setChecked(false);
            }
        });

    }


    /** @noinspection deprecation*/
    @Override
    public void onBackPressed() {
        if (isTaskRoot()){
            AlertDialog alertDialog = new AlertDialog.Builder(this)
                    .setTitle("Warning !!")
                    .setMessage("Do yo want to exit this app?")
                    .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                        }
                    })
                    .setNegativeButton("No", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    })
                    .show();
            alertDialog.getButton(DialogInterface.BUTTON_POSITIVE).setTextColor(getColor(R.color.sky));
            alertDialog.getButton(DialogInterface.BUTTON_NEGATIVE).setTextColor(getColor(R.color.sky));
        }
        else {
            super.onBackPressed();
        }
    }



}