package edu.miracosta.cs134.ssanchez;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    // Fields
    private ImageView henshinImageView;
    private Button henshinImageButton;

    private boolean isMainImage = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Write up reference
        henshinImageView = findViewById(R.id.henshinImageView);
        henshinImageButton = findViewById(R.id.henshinButton);
    }

    public void swapImage(View view)
    {
        if(isMainImage)
        {
            henshinImageView.setImageResource(R.drawable.kamen_rider_1);

        }
        else
        {
            henshinImageView.setImageResource(R.drawable.kamen1v2);
        }

        isMainImage = !isMainImage;
    }
}
