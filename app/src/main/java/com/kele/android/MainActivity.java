package com.kele.android;

        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.text.Editable;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText myEditText = findViewById(R.id.my_input);
        final TextView myTextView = findViewById(R.id.my_text);
        Button myButton = findViewById(R.id.my_button);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myTextView.setText(myEditText.getText());
            }
        });
        final TextView myTextView2 = findViewById(R.id.my_text_2);
        final Button myButton2 = findViewById(R.id.my_button_2);
        myButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(myTextView2.getVisibility()==View.GONE) {
                    myTextView2.setVisibility(View.VISIBLE);
                    myButton2.setText("Hide it");
                }
                else {
                    myTextView2.setVisibility(View.GONE);
                    myButton2.setText("Show me something!");
                }
            }
        });
        Button myButton3 = findViewById(R.id.my_button_3);
        myButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                String myText= myEditText.getText().toString();
                Bundle bundle = new Bundle();
                bundle.putString(SecondActivity.KEY_TEXT,myText);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

    }
}
