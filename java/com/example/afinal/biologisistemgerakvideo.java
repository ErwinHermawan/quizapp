package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

import java.io.File;

public class biologisistemgerakvideo extends AppCompatActivity {
    Button unduh;
    DownloadManager manager=null;
    private long download=-1l;
    private VideoView videoView;
    private MediaController mediaController;
    private Button playVideo;
    Button back;
    Button surfaceView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biologisistemgerakvideo);
        unduh = (Button) findViewById(R.id.unduh);
        back = (Button) findViewById(R.id.back);
        videoView = findViewById(R.id.video);
        playVideo = findViewById(R.id.play);
        surfaceView = findViewById(R.id.surfaceView);
        mediaController = new MediaController(this);
        unduh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                manager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://gravid-slate.000webhostapp.com/jaringanvideo.mp4");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setDestinationUri(Uri.fromFile(new File(biologisistemgerakvideo.this.getExternalFilesDir
                        (Environment.DIRECTORY_DOWNLOADS), "/contoh.mp4")));

                request.setNotificationVisibility(DownloadManager.
                        Request.VISIBILITY_VISIBLE);
                request.setNotificationVisibility(DownloadManager.
                        Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                download = manager.enqueue(request);
                Toast.makeText(getBaseContext(), "Downloading File", Toast.LENGTH_SHORT).show();
            }
        });


        playVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.selvideo);

                videoView.setVideoURI(uri);

                videoView.setMediaController(mediaController);
                mediaController.setAnchorView(videoView);

                videoView.start();
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(biologisistemgerakvideo.this, biolist.class));
            }
        });
        surfaceView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(biologisistemgerakvideo.this, surfaceview2.class));
            }
        });
    }
}