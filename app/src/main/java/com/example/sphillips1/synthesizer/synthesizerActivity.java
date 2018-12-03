package com.example.sphillips1.synthesizer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class synthesizerActivity extends AppCompatActivity {

    private final int WHOLE_NOTE = 1000;
    MediaPlayer mpF;
    MediaPlayer mpE;
    MediaPlayer mpFs;
    MediaPlayer mpG;
    MediaPlayer mpGs;
    MediaPlayer mpA;
    MediaPlayer mpBb;
    MediaPlayer mpB;
    MediaPlayer mpC;
    MediaPlayer mpCs;
    MediaPlayer mpD;
    MediaPlayer mpDs;
    MediaPlayer mpHighF;
    MediaPlayer mpHighE;
    MediaPlayer mpHighFs;
    MediaPlayer mpHighG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_synthesizer);
        mpF = MediaPlayer.create(this, R.raw.scalef);
        mpE = MediaPlayer.create(this, R.raw.scalee);
        mpFs = MediaPlayer.create(this, R.raw.scalefs);
        mpG = MediaPlayer.create(this, R.raw.scaleg);
        mpGs = MediaPlayer.create(this, R.raw.scalegs);
        mpA = MediaPlayer.create( this, R.raw.scalea);
        mpBb = MediaPlayer.create( this, R.raw.scalebb);
        mpB = MediaPlayer.create( this, R.raw.scaleb);
        mpC = MediaPlayer.create(this, R.raw.scalec);
        mpCs = MediaPlayer.create(this, R.raw.scalecs);
        mpD = MediaPlayer.create(this, R.raw.scaled);
        mpDs = MediaPlayer.create(this, R.raw.scaleds);
        mpHighF = MediaPlayer.create(this, R.raw.scalehighf);
        mpHighE = MediaPlayer.create(this, R.raw.scalehighe);
        mpHighFs = MediaPlayer.create(this, R.raw.scalehighfs);
        mpHighG = MediaPlayer.create(this, R.raw.scalehighg);




    }

    private void delayPlaying(int delay) throws InterruptedException
    {
        try{
                Thread.sleep(delay);
        }catch(InterruptedException e)
        {
            Log.e( "synthesizer Activity", "Audio PLayback interrupted");
        }
    }

    public void mChallenge0(View V) {
        Log.e("synthesizerActivity", "challenge 0 button clicked");
        try {
            mpE.start();
            delayPlaying(WHOLE_NOTE);
            mpF.start();
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }

    public void mChallenge1(View v)
    {
        Log.e( "SynthesizerActivity", "Challenge 1 button clicked");
        try
        {
            mpE.seekTo( 0);
            mpE.start();
            delayPlaying(WHOLE_NOTE);
            mpFs.seekTo( 0);
            mpFs.start();
            delayPlaying(WHOLE_NOTE);
            mpG.seekTo( 0);
            mpG.start();
            delayPlaying(WHOLE_NOTE);
            mpGs.seekTo( 0);
            mpGs.start();
            delayPlaying(WHOLE_NOTE);
            mpA.seekTo( 0);
            mpA.start();
            delayPlaying(WHOLE_NOTE);
            mpBb.seekTo( 0);
            mpBb.start();
            delayPlaying(WHOLE_NOTE);
            mpB.seekTo(0);
            mpB.start();
            delayPlaying(WHOLE_NOTE);
            mpC.seekTo(0);
            mpC.start();
            delayPlaying(WHOLE_NOTE);
            mpCs.seekTo(0);
            mpCs.start();
            delayPlaying(WHOLE_NOTE);
            mpD.seekTo(0);
            mpD.start();
            delayPlaying(WHOLE_NOTE);
            mpDs.seekTo(0);
            mpDs.start();
            delayPlaying(WHOLE_NOTE);
            mpHighF.seekTo(0);
            mpHighF.start();
            delayPlaying(WHOLE_NOTE);
            mpHighE.seekTo(0);
            mpHighE.start();
            delayPlaying(WHOLE_NOTE);
            mpHighFs.seekTo(0);
            mpHighFs.start();
            delayPlaying(WHOLE_NOTE);
            mpHighG.seekTo(0);
            mpHighG.start();
            delayPlaying(WHOLE_NOTE);





        }catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }

    public void mChallenge2(View v) {
        MediaPlayer[] mediaPlayers = {mpE, mpFs, mpG, mpA, mpB, mpCs, mpD, mpCs, mpD, mpHighE};
        for (MediaPlayer mp : mediaPlayers) {
            try {
                mp.seekTo(0);
                mp.start();
                delayPlaying(WHOLE_NOTE / 2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }





    public void onFButtonClick(View v) {
        Log.e("Synthesizer", "F button clicked");
        mpF.seekTo(0);
        mpF.start();

    }

    public void onEButtonClick(View v) {
        Log.e("Synthesizer", "E button clicked");
        mpE.seekTo(0);
        mpE.start();

    }

    public void onFsButtonClick(View v) {
        Log.e("Synthesizer", "Fs button when clicked");
        mpFs.seekTo(0);
        mpFs.start();
    }

    public void onGButtonClick(View v) {

        Log.e("Synthesizer", "G button clicked");
        mpG.seekTo(0);
        mpG.start();
    }

    public void onGsButtonClick(View v) {

        Log.e(  "Synthesizer",  "G# button clicked");
        mpGs.seekTo(0);
        mpGs.start();
    }

    public void onAButtonClick(View v) {

        Log.e( "Synthesizer",         "A button clicked");
        mpA.seekTo(    0);
        mpA.start();
    }


 // a,a, high e, high e, high fs, high fs, high e, d, d, cs, cs, b, b, a
    public void mChallenge5(View v)
    {
        Log.e( "SynthesizerActivity", "Challenge 5 button clicked");
        try
        {
            mpE.seekTo( 0);
            mpE.start();
            delayPlaying(WHOLE_NOTE);
            mpFs.seekTo( 0);
            mpFs.start();
            delayPlaying(WHOLE_NOTE);
            mpG.seekTo( 0);
            mpG.start();
            delayPlaying(WHOLE_NOTE);
            mpGs.seekTo( 0);
            mpGs.start();
            delayPlaying(WHOLE_NOTE);
            mpA.seekTo( 0);
            mpA.start();
            delayPlaying(WHOLE_NOTE);
            mpBb.seekTo( 0);
            mpBb.start();
            delayPlaying(WHOLE_NOTE);
            mpB.seekTo(0);
            mpB.start();
            delayPlaying(WHOLE_NOTE);
            mpC.seekTo(0);
            mpC.start();
            delayPlaying(WHOLE_NOTE);
            mpCs.seekTo(0);
            mpCs.start();
            delayPlaying(WHOLE_NOTE);
            mpD.seekTo(0);
            mpD.start();
            delayPlaying(WHOLE_NOTE);
            mpDs.seekTo(0);
            mpDs.start();
            delayPlaying(WHOLE_NOTE);
            mpHighF.seekTo(0);
            mpHighF.start();
            delayPlaying(WHOLE_NOTE);
            mpHighE.seekTo(0);
            mpHighE.start();
            delayPlaying(WHOLE_NOTE);
            mpHighFs.seekTo(0);
            mpHighFs.start();
            delayPlaying(WHOLE_NOTE);
            mpHighG.seekTo(0);
            mpHighG.start();
            delayPlaying(WHOLE_NOTE);



        }catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }



    }






