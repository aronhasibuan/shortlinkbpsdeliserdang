package com.example.shortlinkbpsds;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.TooltipCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private ImageView informationButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        informationButton = findViewById(R.id.informationButton);
        informationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showTooltip(v);
            }
        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void openWebBPS(View view){
        String url = "https://deliserdangkab.bps.go.id/";

        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(intent);
    }

    public void openSimpeg(View view){
        String url = "https://simpeg.bps.go.id/data/";

        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(intent);
    }

    public void openBackoffice(View view){
        String url = "https://backoffice.bps.go.id/";

        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(intent);
    }

    public void openAsamurat(View view){
        String url = "https://asamurat.bps.web.id/apps/login";

        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(intent);
    }

    public void openTKonline(View view){
        String url = "https://sso.bps.go.id/auth/realms/pegawai-bps/protocol/openid-connect/auth?client_id=03340-tk-12s&realm=pegawai-bps&redirect_uri=https://tkonline.bps.go.id/ssocallback.aspx&response_type=code&state=6UHCQlkqf0hWorj1jv43lC8RD1j14XYs";

        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(intent);
    }

    public void openPPID(View view){
        String url = "https://ppid.bps.go.id/?mfd=1212";

        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(intent);
    }

    public void openKIPapp(View view){
        String url = "https://webapps.bps.go.id/kipapp/#/auth/login";

        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(intent);
    }

    public void openMapBPS(View view){
        String url = "https://maps.app.goo.gl/eHj3PhiPKWoffvXW8";

        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(intent);
    }

    public void openInstagram(View view){
        String url = "https://www.instagram.com/bps_deliserdang?igsh=aTY3dHlmZGN0c2I1";

        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(intent);
    }

    public void openFacebook(View view){
        String url = "https://www.facebook.com/share/b1gejMrzbBbcxESa/?mibextid=qi2Omg";

        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(intent);
    }

    public void openYoutube(View view){
        String url = "https://youtube.com/@bpskabupatendeliserdang?si=4NauktDjsxeN8tbr";

        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(intent);
    }

    public void openEmail(View view){
        String url = "mailto:bps1212@bps.go.id";

        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(intent);
    }

    public void showTooltip(View view){
        Toast.makeText(this, "Aplikasi dibuat oleh Aron Hasibuan", Toast.LENGTH_SHORT).show();
    }
}