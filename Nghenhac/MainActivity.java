package com.example.enter.nghenhac;

import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {
    private Button b1,b2,b3,b4,b5,b6;
    private ImageView iv;
    private MediaPlayer mediaPlayer;

    private double startTime = 0;
    private double finalTime = 0;

    private Handler myHandler = new Handler();;
    private int forwardTime = 5000;
    private int backwardTime = 5000;
    private SeekBar seekbar;
    private TextView tx1,tx2,tx3,tx4;
    int numberAudio;

    String lbh="";
    String lbh1="";
    String lbh2="";
    public static int oneTimeOnly = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.button);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button)findViewById(R.id.button3);
        b4 = (Button)findViewById(R.id.button4);
        b5 = (Button)findViewById(R.id.backward);
        b6 = (Button)findViewById(R.id.forward);
        iv = (ImageView)findViewById(R.id.imageView);
        tx1 = (TextView)findViewById(R.id.textView2);
        tx2 = (TextView)findViewById(R.id.textView3);
        tx3 = (TextView)findViewById(R.id.textView4);
        tx4 =  (TextView)findViewById(R.id.Lbh);
        tx4.setMovementMethod(ScrollingMovementMethod.getInstance());
        numberAudio=1;
        mediaPlayer = MediaPlayer.create(this, R.raw.audio);
        seekbar = (SeekBar)findViewById(R.id.seekBar);
        seekbar.setClickable(false);
        b2.setEnabled(false);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Playing sound",Toast.LENGTH_SHORT).show();
                        mediaPlayer.start();
                finalTime = mediaPlayer.getDuration();
                startTime = mediaPlayer.getCurrentPosition();
                if (oneTimeOnly == 0) {
                    seekbar.setMax((int) finalTime);
                    oneTimeOnly = 1;
                }
                tx2.setText(String.format("%d min, %d sec",
                        TimeUnit.MILLISECONDS.toMinutes((long) finalTime),
                        TimeUnit.MILLISECONDS.toSeconds((long) finalTime) -
                                TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes((long)
                                        finalTime)))
                );
                tx1.setText(String.format("%d min, %d sec",
                        TimeUnit.MILLISECONDS.toMinutes((long) startTime),
                        TimeUnit.MILLISECONDS.toSeconds((long) startTime) -
                                TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes((long)
                                        startTime)))
                );
                tx3.setText("Imagine.mp3");
                tx4.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View v) {
                                               tx4.setText(lbh);
                                           }
                                       }

                );
                iv.setImageResource(R.drawable.i2);
                seekbar.setProgress((int)startTime);
                myHandler.postDelayed(UpdateSongTime,100);
                b2.setEnabled(true);
                b3.setEnabled(false);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Pausing sound",Toast.LENGTH_SHORT).show();
                        mediaPlayer.pause();
                b2.setEnabled(false);
                b3.setEnabled(true);
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int temp = (int)startTime;

                if((temp+forwardTime)<=finalTime){
                    startTime = startTime + forwardTime;
                    mediaPlayer.seekTo((int) startTime);
                    Toast.makeText(getApplicationContext(),"You have Jumped forward 5 seconds",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(),"Cannot jump forward 5 seconds",Toast.LENGTH_SHORT).show();
                }
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int temp = (int)startTime;

                if((temp-backwardTime)>0){
                    startTime = startTime - backwardTime;
                    mediaPlayer.seekTo((int) startTime);
                    Toast.makeText(getApplicationContext(),"You have Jumped backward 5 seconds",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(),"Cannot jump backward 5 seconds",Toast.LENGTH_SHORT).show();
                }
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tx4.setHint("Loi bai hat");
                tx4.setText("");
                if (mediaPlayer != null) // Nếu mediaplayer đã tồn tại thì giải phóng
                    mediaPlayer.release();

                // Next các Audio mới bằng cách tạo mới và play
                // Lưu ý đây chỉ là cách đơn giản, nếu muốn play 1 danh sách thì sẽ làm theo cách khác
                if (numberAudio == 3) {
                    numberAudio = 1;
                    mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.audio);
                    tx3.setText("Imagine.mp3");
                    iv.setImageResource(R.drawable.i2);
                    tx4.setOnClickListener(new View.OnClickListener() {
                                               @Override
                                               public void onClick(View v) {
                                                   tx4.setText(lbh);
                                               }
                                           }

                    );
                } else if (numberAudio == 1) {
                    numberAudio = 2;
                    mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.audio2);
                    tx3.setText("Gone.mp3");
                    iv.setImageResource(R.drawable.i3);
                    tx4.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            tx4.setText(lbh1);
                        }
                    }
                    );
                } else if (numberAudio == 2) {
                    numberAudio = 3;
                    mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.audio3);
                    tx3.setText("Hotter than fire.mp3");
                    iv.setImageResource(R.drawable.i4);
                    tx4.setOnClickListener(new View.OnClickListener() {
                                               @Override
                                               public void onClick(View v) {
                                                   tx4.setText(lbh2); }
                                           }
                    );
                }
                mediaPlayer.start();
                Toast.makeText(MainActivity.this, "Next", Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(), "Playing sound",Toast.LENGTH_SHORT).show();
                finalTime = mediaPlayer.getDuration();
                startTime = mediaPlayer.getCurrentPosition();
                if (oneTimeOnly == 0) {
                    seekbar.setMax((int) finalTime);
                    oneTimeOnly = 1;
                }
                tx2.setText(String.format("%d min, %d sec",
                        TimeUnit.MILLISECONDS.toMinutes((long) finalTime),
                        TimeUnit.MILLISECONDS.toSeconds((long) finalTime) -
                                TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes((long)
                                        finalTime)))
                );
                tx1.setText(String.format("%d min, %d sec",
                        TimeUnit.MILLISECONDS.toMinutes((long) startTime),
                        TimeUnit.MILLISECONDS.toSeconds((long) startTime) -
                                TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes((long)
                                        startTime)))
                );
                seekbar.setProgress((int)startTime);
                myHandler.postDelayed(UpdateSongTime,100);
                b2.setEnabled(true);
                b3.setEnabled(false);

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Tương tự next
                tx4.setHint("Loi bai hat");
                tx4.setText("");
                if (mediaPlayer != null)
                    mediaPlayer.release();
                if (numberAudio == 3) {
                    numberAudio = 2;
                    mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.audio2);
                    tx3.setText("Gone.mp3");
                    iv.setImageResource(R.drawable.i3);
                    tx4.setOnClickListener(new View.OnClickListener() {
                                               @Override
                                               public void onClick(View v) {
                                                   tx4.setText(lbh1);}
                                           }
                    );

                } else if (numberAudio == 2) {
                    numberAudio = 1;
                    mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.audio);
                    tx3.setText("Imagine.mp3");
                    iv.setImageResource(R.drawable.i2);
                    tx4.setOnClickListener(new View.OnClickListener() {
                                               @Override
                                               public void onClick(View v) {
                                                   tx4.setText(lbh);
                                               }
                                           }

                    );
                } else if (numberAudio == 1) {
                    numberAudio = 3;
                    mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.audio3);
                    tx3.setText("Hotter than fire.mp3");
                    iv.setImageResource(R.drawable.i4);
                    tx4.setOnClickListener(new View.OnClickListener() {
                                               @Override
                                               public void onClick(View v) {
                                                   tx4.setText(lbh2);
                                               }
                                           }

                    );
                }
                mediaPlayer.start();
                Toast.makeText(MainActivity.this, "Back", Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(), "Playing sound",Toast.LENGTH_SHORT).show();
                finalTime = mediaPlayer.getDuration();
                startTime = mediaPlayer.getCurrentPosition();
                if (oneTimeOnly == 0) {
                    seekbar.setMax((int) finalTime);
                    oneTimeOnly = 1;
                }
                tx2.setText(String.format("%d min, %d sec",
                        TimeUnit.MILLISECONDS.toMinutes((long) finalTime),
                        TimeUnit.MILLISECONDS.toSeconds((long) finalTime) -
                                TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes((long)
                                        finalTime)))
                );
                tx1.setText(String.format("%d min, %d sec",
                        TimeUnit.MILLISECONDS.toMinutes((long) startTime),
                        TimeUnit.MILLISECONDS.toSeconds((long) startTime) -
                                TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes((long)
                                        startTime)))
                );
                seekbar.setProgress((int)startTime);
                myHandler.postDelayed(UpdateSongTime,100);
                b2.setEnabled(true);
                b3.setEnabled(false);

            }
        });
    }

    private Runnable UpdateSongTime = new Runnable()
    {
        public void run()
        {
            startTime = mediaPlayer.getCurrentPosition();
            tx1.setText(String.format("%d min, %d sec",
                    TimeUnit.MILLISECONDS.toMinutes((long) startTime),
                    TimeUnit.MILLISECONDS.toSeconds((long) startTime) -
                            TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.
                                    toMinutes((long) startTime)))
            );
            seekbar.setProgress((int)startTime);
            myHandler.postDelayed(this, 100);

        }
    };
}

