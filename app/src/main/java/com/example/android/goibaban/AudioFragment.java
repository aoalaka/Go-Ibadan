package com.example.android.goibaban;


import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class AudioFragment extends Fragment {
    private MediaPlayer mediaPlayer;
    boolean isPlaying = false;
    private AudioManager mAudioManager;
    AudioManager.OnAudioFocusChangeListener mOnAudioFocusChangeListener = new AudioManager.OnAudioFocusChangeListener() {
        @Override
        public void onAudioFocusChange(int focusChange) {
            if (focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT ||
                    focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK) {
                mediaPlayer.pause();
                mediaPlayer.seekTo(0);
            } else if (focusChange == AudioManager.AUDIOFOCUS_GAIN) {
                mediaPlayer.start();
            } else if (focusChange == AudioManager.AUDIOFOCUS_LOSS) {
                releaseMediaPlayer();
            }
        }
    };

    public AudioFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //To make system audio player available for our app
        mAudioManager = (AudioManager) getActivity().getSystemService(Context.AUDIO_SERVICE);

        View rootView = inflater.inflate(R.layout.fragment_audio, container, false);


        final Button playPause = (Button) rootView.findViewById(R.id.audio_btn);


        playPause.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                releaseMediaPlayer();

                //request audio focus from the system's audio player service
                int result = mAudioManager.requestAudioFocus(mOnAudioFocusChangeListener,
                        AudioManager.STREAM_MUSIC,
                        AudioManager.AUDIOFOCUS_GAIN_TRANSIENT);

                if (result == AudioManager.AUDIOFOCUS_REQUEST_GRANTED) {
                    mediaPlayer = MediaPlayer.create(getActivity(), R.raw.ibadan_anthem);
                    if (isPlaying) {
                        mediaPlayer.pause();
                        Toast.makeText(getActivity(), "Ibadan Anthem is paused", Toast.LENGTH_SHORT).show();
                        playPause.setText("" + "play");
                    } else {
                        mediaPlayer.start();
                        Toast.makeText(getActivity(), "Ibadan Anthem is now playing", Toast.LENGTH_SHORT).show();
                        playPause.setText("" + "pause");
                    }
                    isPlaying = !isPlaying;
                    mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mediaPlayer) {
                            Toast.makeText(getActivity(), "Ibadan Anthem has finished playing.", Toast.LENGTH_SHORT).show();
                            playPause.setText("" + "play");
                        }
                    });
                }
            }
        });

        return rootView;
    }

    @Override
    public void onStop() {
        super.onStop();
        releaseMediaPlayer();
    }

    public void releaseMediaPlayer() {
        if (mediaPlayer != null) {
            mediaPlayer.release();
            mediaPlayer = null;
        }

        //Whether the audio focus is given or not, abandon it. This also unregisters the
        //AudioFocusChangeListener
        mAudioManager.abandonAudioFocus(mOnAudioFocusChangeListener);
    }

}
